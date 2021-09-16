package com.codegym.customer_management.controller;

import com.codegym.customer_management.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("customerList", iCustomerService.findAll());
        return "list";
    }
    @GetMapping("/view/{id}")
    public String showViewCustomer(@PathVariable Long id, Model model) {
        if (iCustomerService.findById(id) == null) {
            model.addAttribute("customer", iCustomerService.findById(id));
        }
        return "view";
    }
}
