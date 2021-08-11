package model.repository.customer_repository;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    Customer findById(int id);
    void create(Customer customer);
    void update(Customer customer);
    void remove(int id);
}
