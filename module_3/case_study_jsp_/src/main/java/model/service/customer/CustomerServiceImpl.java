package model.service.customer;

import model.bean.customer.Customer;
import model.repository.customer_repository.CustomerRepositoryImpl;
import model.repository.customer_repository.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return this.iCustomerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return this.iCustomerRepository.findById(id);
    }

    @Override
    public void create(Customer customer) {
        this.iCustomerRepository.create(customer);
    }

    @Override
    public void update(Customer customer) {
        this.iCustomerRepository.update(customer);
    }

    @Override
    public void remove(int id) {
        this.iCustomerRepository.remove(id);
    }
}
