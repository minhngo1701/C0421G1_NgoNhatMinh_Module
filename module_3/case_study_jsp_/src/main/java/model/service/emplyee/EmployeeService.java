package model.service.emplyee;

import model.bean.employee.Employee;
import model.repository.employee_repository.EmployeeRepositoryImpl;
import model.repository.employee_repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Employee> findAll() {
        return this.iEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return this.iEmployeeRepository.findById(id);
    }

    @Override
    public void create(Employee employee) {
        this.iEmployeeRepository.create(employee);
    }

    @Override
    public void update(Employee employee) {
        this.iEmployeeRepository.update(employee);
    }

    @Override
    public void remove(int id) {
        this.iEmployeeRepository.remove(id);
    }
}
