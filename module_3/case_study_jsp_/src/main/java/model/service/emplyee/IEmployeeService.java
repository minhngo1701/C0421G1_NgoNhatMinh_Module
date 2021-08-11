package model.service.emplyee;

import model.bean.employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    void create(Employee employee);
    void update(Employee employee);
    void remove(int id);
}
