package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.Blog;
import com.codegym.blog.model.bean.Category;
import com.codegym.blog.model.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        Category category = iCategoryRepository.findById(id).orElse(null);
        return iCategoryRepository.findById(id).get();
    }


    @Override
    public void update(Category category) {
        iCategoryRepository.save(category);
    }


    @Override
    public void remove(int id) {
        iCategoryRepository.deleteById(id);
    }

}
