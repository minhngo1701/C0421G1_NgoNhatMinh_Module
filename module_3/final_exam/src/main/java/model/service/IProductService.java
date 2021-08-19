package model.service;

import model.bean.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
//    Map<String, String> create(Product product);
//    Map<String, String> update(Product product);
    void create(Product product);
    void update(Product product);
    void remove(int id);
}
