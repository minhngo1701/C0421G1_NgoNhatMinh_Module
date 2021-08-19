package model.repository;

import model.bean.Category;

import java.util.List;

public interface ICategoryRepo {
    List<Category> findAll();
}
