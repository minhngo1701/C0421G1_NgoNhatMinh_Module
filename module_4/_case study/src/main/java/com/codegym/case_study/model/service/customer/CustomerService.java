package com.codegym.case_study.model.service.customer;

import com.codegym.case_study.model.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void delete(Long id);
}
