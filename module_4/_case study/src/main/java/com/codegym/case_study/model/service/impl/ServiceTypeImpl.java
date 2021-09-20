package com.codegym.case_study.model.service.impl;

import com.codegym.case_study.model.entity.service_entity.ServiceType;
import com.codegym.case_study.model.repository.service_repo.ServiceTypeRepo;
import com.codegym.case_study.model.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceTypeImpl implements ServiceTypeService {
    @Autowired
    private ServiceTypeRepo serviceTypeRepo;
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepo.findAll();
    }
}
