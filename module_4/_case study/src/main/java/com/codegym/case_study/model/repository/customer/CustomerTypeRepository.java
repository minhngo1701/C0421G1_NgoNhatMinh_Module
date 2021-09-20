package com.codegym.case_study.model.repository.customer;

import com.codegym.case_study.model.entity.customer.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {
}
