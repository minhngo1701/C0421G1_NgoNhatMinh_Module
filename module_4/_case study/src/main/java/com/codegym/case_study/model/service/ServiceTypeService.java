package com.codegym.case_study.model.service;

import com.codegym.case_study.model.entity.service_entity.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAll();
}
