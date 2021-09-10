package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.bean.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);

    Blog findById(int id);

    void update(Blog blog);

    void remove(int id);
    List<Blog> findAllByNameBlog(String name);
   List<Blog> findByCategory(int id);
}
