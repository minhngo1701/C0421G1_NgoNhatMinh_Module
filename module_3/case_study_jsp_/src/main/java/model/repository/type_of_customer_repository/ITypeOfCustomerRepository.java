package model.repository.type_of_customer_repository;

import model.bean.customer.TypeOfCustomer;

import java.util.List;

public interface ITypeOfCustomerRepository {
    List<TypeOfCustomer> findAll();
}
