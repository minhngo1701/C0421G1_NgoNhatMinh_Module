package model.repository.employee_repository;

import model.bean.employee.Employee;
import model.repository.BaseRepository;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n" +
                            "FROM employee;");
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setPositionId(resultSet.getInt("position_id"));
                employee.setEducationId(resultSet.getInt("education_id"));
                employee.setDivisionId(resultSet.getInt("part_id"));
                employee.setDateOfBirth(resultSet.getString("date_of_birth"));
                employee.setId_card(resultSet.getString("identity_number"));
                employee.setSalary(resultSet.getDouble("salary"));
                employee.setPhone(resultSet.getString("phone_number"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
                employee.setUserName(resultSet.getString("user_name"));
                employees.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees ;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT *\n" +
                            "FROM employee\n" +
                            "WHERE employee_id = ?");
            preparedStatement.setString(1, id + "");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("employee_name"));
                employee.setPositionId(resultSet.getInt("position_id"));
                employee.setEducationId(resultSet.getInt("education_id"));
                employee.setDivisionId(resultSet.getInt("part_id"));
                employee.setDateOfBirth(resultSet.getString("date_of_birth"));
                employee.setId_card(resultSet.getString("identity_number"));
                employee.setSalary(resultSet.getDouble("salary"));
                employee.setPhone(resultSet.getString("phone_number"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("address"));
                employee.setUserName(resultSet.getString("user_name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public void create(Employee employee) {
        try {
            CallableStatement callableStatement =
                    this.baseRepository.getConnection().prepareCall("CALL employee_sp(?,?,?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, employee.getName());
            callableStatement.setString(2, employee.getPositionId() + "" );
            callableStatement.setString(3, employee.getEducationId() + "");
            callableStatement.setString(4,employee.getDivisionId() + "" );
            callableStatement.setString(5, employee.getDateOfBirth() + "");
            callableStatement.setString(6, employee.getId_card());
            callableStatement.setString(7, employee.getSalary() + "");
            callableStatement.setString(8, employee.getPhone());
            callableStatement.setString(9, employee.getEmail());
            callableStatement.setString(10, employee.getAddress());
            callableStatement.setString(11, employee.getUserName());
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Employee employee) {
        try {
            CallableStatement callableStatement =
                    this.baseRepository.getConnection().prepareCall("CALL edit_sp(?,?,?,?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, employee.getId() + "");
            callableStatement.setString(2, employee.getName());
            callableStatement.setString(3, employee.getPositionId() + "" );
            callableStatement.setString(4, employee.getEducationId() + "");
            callableStatement.setString(5,employee.getDivisionId() + "" );
            callableStatement.setString(6, employee.getDateOfBirth() + "");
            callableStatement.setString(7, employee.getId_card());
            callableStatement.setString(8, employee.getSalary() + "");
            callableStatement.setString(9, employee.getPhone());
            callableStatement.setString(10, employee.getEmail());
            callableStatement.setString(11, employee.getAddress());
            callableStatement.setString(12, employee.getUserName());
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("DELETE FROM employee\n" +
                            "WHERE employee_id = ?");
            preparedStatement.setString(1, id + "");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
