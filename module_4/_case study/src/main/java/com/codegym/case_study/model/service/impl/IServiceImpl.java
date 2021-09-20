package com.codegym.case_study.model.service.impl;

import com.codegym.case_study.model.entity.service_entity.Service;
import com.codegym.case_study.model.repository.service_repo.ServiceRepository;
import com.codegym.case_study.model.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class IServiceImpl implements IService {
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public void save(Service service) {
    serviceRepository.save(service);
    }
}
