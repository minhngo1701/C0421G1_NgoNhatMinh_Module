package com.codegym.case_study.model.service.user;

import com.codegym.case_study.model.entity.user.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
}
