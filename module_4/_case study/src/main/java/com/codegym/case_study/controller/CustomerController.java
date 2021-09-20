package com.codegym.case_study.controller;

import com.codegym.case_study.dto.CustomerDto;
import com.codegym.case_study.model.entity.customer.Customer;
import com.codegym.case_study.model.entity.customer.CustomerType;
import com.codegym.case_study.model.service.customer.CustomerService;
import com.codegym.case_study.model.service.customer.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerTypeService customerTypeService;

 @GetMapping("/list")
    public String showList(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("customerList", customerService.findAll(pageable));
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreateCustomer(Model model) {

        List<CustomerType> customerTypes = customerTypeService.findAll();
        model.addAttribute("customerTypeList", customerTypes);


        model.addAttribute("customerDto", new CustomerDto());
        return "customer/create";
    }
    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("customerDto") @Valid CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {

            List<CustomerType> customerTypes = customerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypes);


            return "customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("successMsg", "Create customer: " + customer.getNameCustomer() + "success");
            return "redirect:/customer/list";
        }
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        if (customerService.findById(id) == null) {
            return "error";
        }
        Customer customer = customerService.findById(id);

        model.addAttribute("customer", customer);


        model.addAttribute("customerList", customerTypeService.findAll());

        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("successMsg", "Update customer: " + customer.getNameCustomer() + " success");
        return "redirect:/customer/list";
    }

}
