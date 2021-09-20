package com.codegym.case_study.model.repository.employee;

import com.codegym.case_study.model.entity.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division, Long> {
}
