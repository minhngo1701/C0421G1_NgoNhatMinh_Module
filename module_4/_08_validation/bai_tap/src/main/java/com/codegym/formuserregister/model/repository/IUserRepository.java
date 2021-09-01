package com.codegym.formuserregister.model.repository;

import com.codegym.formuserregister.model.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
