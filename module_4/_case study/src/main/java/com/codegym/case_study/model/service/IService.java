package com.codegym.case_study.model.service;

import com.codegym.case_study.model.entity.service_entity.Service;

import java.util.List;

public interface IService {
    List<Service> findAll();
    void save(Service service);
}
