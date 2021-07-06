package _case_study.services;

import _case_study.models.Customer;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> getAll();
}
