package com.codegym.customer_management.model.service;

import com.codegym.customer_management.model.bean.Customer;
import com.codegym.customer_management.model.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id).get();
    }
}
