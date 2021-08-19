package model.service.customer;

import model.bean.customer.Customer;
import model.repository.customer_repository.CustomerRepositoryImpl;
import model.repository.customer_repository.ICustomerRepository;
import model.service.common.Validate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, String> create(Customer customer) {
       Map<String, String> mapMessage = new HashMap<>();
       if (Validate.validateName(customer.getCustomerName()) != null || Validate.validateCustomerCode(customer.getCustomerCode()) != null
       || Validate.validateIdCard(customer.getCardId()) != null || Validate.validateEmail(customer.getEmailCus()) != null
       || Validate.validatePhone(customer.getPhoneCus()) != null) {
           mapMessage.put("name", Validate.validateName(customer.getCustomerName()));
           mapMessage.put("customerCode", Validate.validateCustomerCode(customer.getCustomerCode()));
           mapMessage.put("idCard", Validate.validateIdCard(customer.getCardId()));
           mapMessage.put("email", Validate.validateEmail(customer.getEmailCus()));
           mapMessage.put("phone", Validate.validatePhone(customer.getPhoneCus()));
       } else {
           this.iCustomerRepository.create(customer);
       }
       return mapMessage;
    }

    @Override
    public Map<String, String> update(Customer customer) {
        Map<String, String> mapMessage = new HashMap<>();
        if (Validate.validateName(customer.getCustomerName()) != null || Validate.validateCustomerCode(customer.getCustomerCode()) != null
                || Validate.validateIdCard(customer.getCardId()) != null
                || Validate.validateEmail(customer.getEmailCus()) != null
                || Validate.validatePhone(customer.getPhoneCus()) != null) {
            mapMessage.put("name", Validate.validateName(customer.getCustomerName()));
            mapMessage.put("customerCode", Validate.validateName(customer.getCustomerCode()));
            mapMessage.put("idCard", Validate.validateName(customer.getCardId()));
            mapMessage.put("email", Validate.validateName(customer.getEmailCus()));
            mapMessage.put("phone", Validate.validateName(customer.getPhoneCus()));
        } else {
            this.iCustomerRepository.update(customer);
        }
        return mapMessage;
    }
    @Override
    public void remove(int id) {
        this.iCustomerRepository.remove(id);
    }

    @Override
    public void search(String name) {

    }
}
