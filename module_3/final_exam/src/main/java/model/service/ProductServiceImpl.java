package model.service;

import model.bean.Product;
import model.repository.IProductRepository;
import model.repository.ProductRepositoryImpl;

import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    private IProductRepository iProductRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return this.iProductRepository.findById(id);
    }

    @Override
    public void create(Product product) {
//        Map<String, String> mapMessage = new HashMap<>();
//        if (Validate.validateName(product.getProductName()) != null || Validate.validateCustomerCode(product.getCustomerCode()) != null
//                || Validate.validateIdCard(customer.getCardId()) != null || Validate.validateEmail(customer.getEmailCus()) != null
//                || Validate.validatePhone(customer.getPhoneCus()) != null) {
//            mapMessage.put("name", Validate.validateName(customer.getCustomerName()));
//            mapMessage.put("customerCode", Validate.validateCustomerCode(customer.getCustomerCode()));
//            mapMessage.put("idCard", Validate.validateIdCard(customer.getCardId()));
//            mapMessage.put("email", Validate.validateEmail(customer.getEmailCus()));
//            mapMessage.put("phone", Validate.validatePhone(customer.getPhoneCus()));
//        } else {
//            this.iCustomerRepository.create(customer);
//        }
        this.iProductRepository.create(product);
    }

    @Override
    public void update(Product product) {
//        Map<String, String> mapMessage = new HashMap<>();
//        if (Validate.validateName(customer.getCustomerName()) != null || Validate.validateCustomerCode(customer.getCustomerCode()) != null
//                || Validate.validateIdCard(customer.getCardId()) != null
//                || Validate.validateEmail(customer.getEmailCus()) != null
//                || Validate.validatePhone(customer.getPhoneCus()) != null) {
//            mapMessage.put("name", Validate.validateName(customer.getCustomerName()));
//            mapMessage.put("customerCode", Validate.validateName(customer.getCustomerCode()));
//            mapMessage.put("idCard", Validate.validateName(customer.getCardId()));
//            mapMessage.put("email", Validate.validateName(customer.getEmailCus()));
//            mapMessage.put("phone", Validate.validateName(customer.getPhoneCus()));
//        } else {
//            this.iCustomerRepository.update(customer);
//        }
        this.iProductRepository.update(product);
    }

    @Override
    public void remove(int id) {
        this.iProductRepository.remove(id);
    }
}
