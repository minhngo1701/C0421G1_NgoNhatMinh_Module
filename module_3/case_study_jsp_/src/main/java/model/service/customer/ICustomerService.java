package model.service.customer;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void create(Customer customer);
    void update(Customer customer);
    void remove(int id);
}
