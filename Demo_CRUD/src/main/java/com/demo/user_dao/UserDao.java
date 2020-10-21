/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.user_dao;

import com.demo.model.User;
import java.util.List;

/**
 *
 * @author ThanhNguyen
 */
public interface UserDao {
     public List<User> getAllUser();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public List<User> searchUsers(String search);
    public User getById(int id);
    public int getRoleUser(String nameString,String pass);
}
