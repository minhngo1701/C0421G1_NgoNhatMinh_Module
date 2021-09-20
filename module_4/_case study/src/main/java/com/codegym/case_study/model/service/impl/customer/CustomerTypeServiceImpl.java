package com.codegym.case_study.model.service.impl.customer;

import com.codegym.case_study.model.entity.customer.CustomerType;
import com.codegym.case_study.model.repository.customer.CustomerRepository;
import com.codegym.case_study.model.repository.customer.CustomerTypeRepository;
import com.codegym.case_study.model.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
