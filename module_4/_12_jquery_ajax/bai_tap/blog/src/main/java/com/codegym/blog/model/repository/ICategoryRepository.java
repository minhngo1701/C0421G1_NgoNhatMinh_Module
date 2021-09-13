package com.codegym.blog.model.repository;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
