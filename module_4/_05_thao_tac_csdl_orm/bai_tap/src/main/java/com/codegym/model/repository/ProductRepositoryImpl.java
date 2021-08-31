package com.codegym.model.repository;

import com.codegym.model.bean.Product;
import org.springframework.jca.cci.connection.ConnectionFactoryUtils;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Transactional
@Repository
public class ProductRepositoryImpl implements IProductRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product AS p ", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void update(int id, Product product) {
        entityManager.merge(product);
    }

    @Override
    public void remove(int id) {
        entityManager.remove(findById(id));
    }

    @Override
    public List<Product> search(String name) {
        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product as p WHERE p.nameProduct=:p1 ", Product.class)
                .setParameter("p1", name);
        return query.getResultList();


    }
}
