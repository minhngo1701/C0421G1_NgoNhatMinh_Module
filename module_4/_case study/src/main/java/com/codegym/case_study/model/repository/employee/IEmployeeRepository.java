package com.codegym.case_study.model.repository.employee;

import com.codegym.case_study.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findAllByNameEmployee(Pageable pageable, String name);
}
