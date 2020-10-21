/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.user_services_impl;

import com.demo.model.User;
import com.demo.user_dao.UserDao;
import com.demo.user_dao_impl.UserDaoImpl;
import com.demo.user_services.UserServices;
import java.util.List;

/**
 *
 * @author ThanhNguyen
 */
public class UserServicesImpl implements UserServices {

    UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> getAllUser() {
        List<User> listUsers = userDao.getAllUser();
        return listUsers;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<User> searchUsers(String search) {
        List<User> listUsers = userDao.searchUsers(search);
        return listUsers;
    }

    @Override
    public User getById(int id) {
        User user = userDao.getById(id);
        return user;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        List<User> listUsers = userDao.getAllUser();
        for (User user : listUsers) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getRoleUser(String nameString,String pass) {
        return userDao.getRoleUser(nameString, pass);
    }

}
