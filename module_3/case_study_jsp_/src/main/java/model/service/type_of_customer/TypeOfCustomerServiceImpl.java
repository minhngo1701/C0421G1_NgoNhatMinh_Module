package model.service.type_of_customer;

import model.bean.customer.TypeOfCustomer;
import model.repository.type_of_customer_repository.ITypeOfCustomerRepository;
import model.repository.type_of_customer_repository.TypeOfCustomerRepositoryImpl;

import java.util.List;

public class TypeOfCustomerServiceImpl implements ITypeOfCustomerService {
    private ITypeOfCustomerRepository iTypeOfCustomerRepository = new TypeOfCustomerRepositoryImpl();
    @Override
    public List<TypeOfCustomer> findAll() {
        return this.iTypeOfCustomerRepository.findAll();
    }
}
