package com.codegym.case_study.model.repository.employee;

import com.codegym.case_study.model.entity.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
