package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
}
