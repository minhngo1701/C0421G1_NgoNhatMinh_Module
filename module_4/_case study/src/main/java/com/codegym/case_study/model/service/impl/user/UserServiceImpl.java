package com.codegym.case_study.model.service.impl.user;

import com.codegym.case_study.model.entity.user.User;
import com.codegym.case_study.model.service.user.UserService;
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
