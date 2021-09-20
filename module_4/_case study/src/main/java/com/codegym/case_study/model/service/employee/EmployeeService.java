package com.codegym.case_study.model.service.employee;

import com.codegym.case_study.model.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Long id);
    void save(Employee employee);
    void delete(Long id);

    Page<Employee> findEmployee(Pageable pageable,String name);
}
