package com.codegym.case_study.model.service.impl.employee;

import com.codegym.case_study.model.entity.employee.Division;
import com.codegym.case_study.model.repository.employee.DivisionRepository;
import com.codegym.case_study.model.service.employee.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DivisionImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
