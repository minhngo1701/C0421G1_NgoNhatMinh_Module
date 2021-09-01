package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.bean.Category;
import com.codegym.blog.model.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void save(Category category);

    Category findById(int id);

    void update(Category category);

    void remove(int id);

}
