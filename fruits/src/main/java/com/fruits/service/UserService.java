package com.fruits.service;

import java.util.List;

import com.fruits.model.User;

public interface UserService {
	public List<User> getAll();
    public User getUserByNameAndPass(String userName, String password);
    public User getUserById(int id);
    public void updateUser(User user);
    public void addUser(User user);
    public void deleteUser(int id);
    public boolean isAdmin(int role);
    public boolean checkLogin(User user);
}
