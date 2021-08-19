package model.service;

import model.bean.Category;
import model.repository.CategoryRepoImpl;
import model.repository.ICategoryRepo;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService {
    private ICategoryRepo iCategoryRepo = new CategoryRepoImpl();
    @Override
    public List<Category> findAll() {
        return this.iCategoryRepo.findAll();
    }
}
