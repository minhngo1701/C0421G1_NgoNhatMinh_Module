package model.repository.customer_repository;

import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT * \n" +
                            "FROM customer\n" +
                            "INNER JOIN type_of_customer ON type_of_customer.type_of_customer_id = customer.customer_id");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getInt("customer_id"));
                customer.setTypeOfCustomerId(resultSet.getString("type_of_customer_id"));
                customer.setName(resultSet.getString("customer_name"));
                customer.setDateOfBirth(resultSet.getString("date_of_birth"));
                customer.setCardId(resultSet.getString("identity_number"));
                customer.setPhone(resultSet.getString("phone_number"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAddress(resultSet.getString("address"));
                customers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers ;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void create(Customer customer) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
