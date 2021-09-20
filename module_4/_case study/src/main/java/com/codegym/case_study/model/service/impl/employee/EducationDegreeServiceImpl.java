package com.codegym.case_study.model.service.impl.employee;

import com.codegym.case_study.model.entity.employee.EducationDegree;
import com.codegym.case_study.model.repository.employee.EducationDegreeRepository;
import com.codegym.case_study.model.service.employee.EducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }
}
