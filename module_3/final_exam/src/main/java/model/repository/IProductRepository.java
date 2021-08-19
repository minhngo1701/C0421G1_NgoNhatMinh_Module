package model.repository;

import model.bean.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void create(Product product);
    void update(Product product);
    void remove(int id);
}
