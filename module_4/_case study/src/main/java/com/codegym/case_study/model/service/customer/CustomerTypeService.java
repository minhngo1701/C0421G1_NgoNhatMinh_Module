package com.codegym.case_study.model.service.customer;

import com.codegym.case_study.model.entity.customer.CustomerType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();
}
