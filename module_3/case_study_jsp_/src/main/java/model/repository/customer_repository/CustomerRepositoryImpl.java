package model.repository.customer_repository;

import model.bean.customer.Customer;
import model.repository.BaseRepository;

import java.sql.CallableStatement;
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
                            "FROM customer\n");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setTypeOfCustomerId(resultSet.getInt("type_of_customer_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setDateOfBirth(resultSet.getString("date_of_birth"));
                customer.setGender(resultSet.getBoolean("gender"));
                customer.setCardId(resultSet.getString("identity_number"));
                customer.setPhoneCus(resultSet.getString("phone_number"));
                customer.setEmailCus(resultSet.getString("email"));
                customer.setAddressCus(resultSet.getString("address"));
                customer.setCustomerCode(resultSet.getString("customer_code"));
                customers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("SELECT * \n" +
                            "FROM customer\n" + "WHERE customer_id = ?");
            preparedStatement.setString(1, id + "");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setTypeOfCustomerId(resultSet.getInt("type_of_customer_id"));
                customer.setCustomerName(resultSet.getString("customer_name"));
                customer.setDateOfBirth(resultSet.getString("date_of_birth"));
                customer.setGender(resultSet.getBoolean("gender"));
                customer.setCardId(resultSet.getString("identity_number"));
                customer.setPhoneCus(resultSet.getString("phone_number"));
                customer.setEmailCus(resultSet.getString("email"));
                customer.setAddressCus(resultSet.getString("address"));
                customer.setCustomerCode(resultSet.getString("customer_code"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public void create(Customer customer) {
        try {
            CallableStatement callableStatement =
                    this.baseRepository.getConnection().prepareCall("CALL create_customer_sp(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, customer.getTypeOfCustomerId() + "");
            callableStatement.setString(2, customer.getCustomerName());
            callableStatement.setString(3, customer.getDateOfBirth());
            callableStatement.setBoolean(4, customer.getGender());
            callableStatement.setString(5, customer.getCardId());
            callableStatement.setString(6, customer.getPhoneCus());
            callableStatement.setString(7, customer.getEmailCus());
            callableStatement.setString(8, customer.getAddressCus());
            callableStatement.setString(9, customer.getCustomerCode());
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Customer customer) {
        try {
            CallableStatement callableStatement =
                    this.baseRepository.getConnection().prepareCall("Call update_customer_sp(?,?,?,?,?,?,?,?,?)");
            callableStatement.setString(1, customer.getCustomerId() + "");
            callableStatement.setString(2, customer.getTypeOfCustomerId() + "");
            callableStatement.setString(3, customer.getCustomerName());
            callableStatement.setString(4, customer.getDateOfBirth());
            callableStatement.setBoolean(5, customer.getGender());
            callableStatement.setString(6, customer.getCardId());
            callableStatement.setString(7, customer.getPhoneCus());
            callableStatement.setString(8, customer.getEmailCus());
            callableStatement.setString(9, customer.getAddressCus());
            callableStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement preparedStatement =
                    this.baseRepository.getConnection().prepareStatement("DELETE FROM customer\n"
                    + "WHERE customer_id = ?");
            preparedStatement.setString(1, id + "");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

