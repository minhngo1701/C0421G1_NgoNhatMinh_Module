package model.service.type_of_customer;

import model.bean.customer.TypeOfCustomer;

import java.util.List;

public interface ITypeOfCustomerService {
    List<TypeOfCustomer> findAll();
}
