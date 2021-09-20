package com.codegym.case_study.model.service;

import com.codegym.case_study.model.entity.service_entity.RentType;

import java.util.List;

public interface RentTypeService {
    List<RentType> findAll();
}
