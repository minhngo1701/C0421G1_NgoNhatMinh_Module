package com.codegym.case_study.model.service.impl;

import com.codegym.case_study.model.entity.service_entity.RentType;
import com.codegym.case_study.model.repository.service_repo.RentTypeRepo;
import com.codegym.case_study.model.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentTypeServiceImpl implements RentTypeService {
    @Autowired
    private RentTypeRepo rentTypeRepo;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepo.findAll();
    }
}
