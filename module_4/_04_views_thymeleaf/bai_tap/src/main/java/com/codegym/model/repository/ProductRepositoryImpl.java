package com.codegym.model.repository;

import com.codegym.model.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepositoryImpl implements IProductRepository{
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone Pro Max", 21000000,"new 100%", "America"));
        products.put(2, new Product(2, "Tu lanh", 8000000, "new", "Japan"));
        products.put(3, new Product(3, "Tivi LCD 50inch", 12000000, "Brandnew", "Japan"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        for (Integer key : products.keySet()) {
            if (products.get(key).getNameProduct().equals(name)) {
                productList.add(products.get(key));
            }
        }
        return productList;
    }
}
