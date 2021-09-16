package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.repository.IBlogRepository;
import com.codegym.blog.model.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }


    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id).orElseGet(null);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findAllByNameBlog(String name) {
        return iBlogRepository.findAllByNameBlog(name);
    }

    @Override
    public List<Blog> findByCategory(int id) { // lấy ra category để lấy về blog
        List<Blog> blogs = new ArrayList<>(iCategoryRepository.findById(id).get().getBlog());
        return blogs;
    }


}
