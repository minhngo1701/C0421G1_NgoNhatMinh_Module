package com.codegym.blog.model.service;

import com.codegym.blog.model.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userService;
    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public User findById(int id) {
        return userService.findById(id);
    }
}
