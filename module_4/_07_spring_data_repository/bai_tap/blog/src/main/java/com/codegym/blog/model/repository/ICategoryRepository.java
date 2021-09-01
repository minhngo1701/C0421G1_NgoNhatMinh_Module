package com.codegym.blog.model.repository;

import com.codegym.blog.model.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
