package com.codegym.add_card.model.service;

import com.codegym.add_card.model.bean.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
