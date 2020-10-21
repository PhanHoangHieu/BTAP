/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.user_services;

import com.demo.model.User;
import java.util.List;

/**
 *
 * @author ThanhNguyen
 */
public interface UserServices {
    public List<User> getAllUser();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> searchUsers(String search);
    public User getById(int id);
    public boolean checkLogin(String username , String password);
    public int getRoleUser(String name ,String pass);
}
