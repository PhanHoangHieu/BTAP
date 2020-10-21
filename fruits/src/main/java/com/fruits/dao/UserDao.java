package com.fruits.dao;

import java.util.List;

import com.fruits.model.User;


public interface UserDao {
	List<User> getAll();
    User findUserByNameAndPassword(String userName, String password);
    User findUserById(int id);
    void updateUser(User user);
    void addUser(User user);
    void deleteUser(int id);
}
