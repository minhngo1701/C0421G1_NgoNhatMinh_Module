package com.codegym.case_study.model.service.impl.employee;

import com.codegym.case_study.model.entity.employee.Position;
import com.codegym.case_study.model.repository.employee.PositionRepository;
import com.codegym.case_study.model.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
