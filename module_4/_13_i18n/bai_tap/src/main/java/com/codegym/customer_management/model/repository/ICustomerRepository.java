package com.codegym.customer_management.model.repository;

import com.codegym.customer_management.model.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
