package com.codegym.customer_management.model.service;

import com.codegym.customer_management.model.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

}
