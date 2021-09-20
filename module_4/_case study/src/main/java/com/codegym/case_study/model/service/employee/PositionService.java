package com.codegym.case_study.model.service.employee;

import com.codegym.case_study.model.entity.employee.Position;

import java.util.List;

public interface PositionService {
    List<Position> findAll();
}
