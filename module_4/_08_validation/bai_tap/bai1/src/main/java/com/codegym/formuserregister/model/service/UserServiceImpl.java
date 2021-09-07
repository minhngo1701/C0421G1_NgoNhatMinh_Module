package com.codegym.formuserregister.model.service;

import com.codegym.formuserregister.model.bean.User;
import com.codegym.formuserregister.model.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return iUserRepository.findById(id).get();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void remove(int id) {
        iUserRepository.deleteById(id);
    }
}
