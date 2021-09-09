package com.codegym.add_card.model.repository;

import com.codegym.add_card.model.bean.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
