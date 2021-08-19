package model.service.customer;

import model.bean.customer.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    Map<String, String> create(Customer customer);
    Map<String, String> update(Customer customer);
    void remove(int id);
    void search(String name);
}
