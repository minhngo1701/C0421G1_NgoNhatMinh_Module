package com.codegym.case_study.model.repository.customer;

import com.codegym.case_study.model.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
