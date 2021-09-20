package com.codegym.case_study.model.service.impl.employee;

import com.codegym.case_study.model.entity.employee.Employee;
import com.codegym.case_study.model.repository.employee.IEmployeeRepository;
import com.codegym.case_study.model.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public Employee findById(Long id) {
        return iEmployeeRepository.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findEmployee(Pageable pageable,String name) {
        return iEmployeeRepository.findAllByNameEmployee(pageable,name);
    }
}
