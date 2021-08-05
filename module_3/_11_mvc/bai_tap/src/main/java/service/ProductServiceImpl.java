package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone pro max", 100));
        products.put(2, new Product(2, "Ipad", 50));
        products.put(3, new Product(3, "Tv LCD", 40));
        products.put(4, new Product(4, "Laptop", 75));
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
        for (Integer product1 : products.keySet()) {
            if (products.get(product1).getName().equals(name)) {
                productList.add(products.get(product1));
            }
        }
        return productList ;
    }


}
