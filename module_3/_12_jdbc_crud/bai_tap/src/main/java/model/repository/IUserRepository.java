package model.repository;

import model.bean.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();
    User findById(int id);
    void create(User user);
    void update(User user);
    void delete(int id);
    List<User> search (String country);
    List<User> orderBy();
    User getUserById(int id);
    void insertUserStore(User user);
}
