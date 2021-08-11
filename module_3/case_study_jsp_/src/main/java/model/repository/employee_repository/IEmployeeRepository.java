package model.repository.employee_repository;

import model.bean.employee.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();
    Employee findById(int id);
    void create(Employee employee);
    void update(Employee employee);
    void remove(int id);
}
