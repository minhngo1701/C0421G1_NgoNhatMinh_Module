package com.codegym.case_study.controller;

import com.codegym.case_study.dto.ContractDto;
import com.codegym.case_study.model.entity.contract.Contract;
import com.codegym.case_study.model.entity.customer.Customer;
import com.codegym.case_study.model.entity.employee.Employee;
import com.codegym.case_study.model.entity.service_entity.Service;
import com.codegym.case_study.model.service.IService;
import com.codegym.case_study.model.service.contract.ContractService;
import com.codegym.case_study.model.service.customer.CustomerService;
import com.codegym.case_study.model.service.employee.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private IService iService;

    @GetMapping("")
    public String showContractPage() {
        return "contract/view";
    }

    @GetMapping("/create")
    public String showCreateContract(Model model) {
        model.addAttribute("employeeList", employeeService.findAll());
        model.addAttribute("customerList", customerService.findAll());
        model.addAttribute("serviceList", iService.findAll());
        model.addAttribute("contractDto", new ContractDto());
        return "contract/create";
    }
    @PostMapping("/create")
    public String createEmployee(@ModelAttribute("contractDto") @Valid ContractDto contractDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            List<Employee> employees = employeeService.findAll();
            model.addAttribute("employeeList", employees);

            List<Customer> customers = customerService.findAll();
            model.addAttribute("customerList", customers);

            List<Service> services = iService.findAll();
            model.addAttribute("serviceList", services);

            return "contract/create";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            contractService.save(contract);
            redirectAttributes.addFlashAttribute("successMsg", "Create contract success");
            return "redirect:/contract/";
        }
    }


}
