package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(int id);

    void update(Blog blog);

    void remove(int id);
    List<Blog> findAllByNameBlog(String name);
}
