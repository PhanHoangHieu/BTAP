/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.user_dao_impl;

import com.demo.connect.Connect;
import com.demo.model.User;
import com.demo.user_dao.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThanhNguyen
 */
public class UserDaoImpl implements UserDao {
    
    static Connection conn;
    static PreparedStatement psmt;
    static ResultSet rs;
    
    @Override
    public List<User> getAllUser() {
        List<User> listUsers = new ArrayList<>();
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("select * from User order by User_id asc");
            rs = psmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAddress(rs.getString(4));
                user.setRole_id(rs.getInt(5));             
                listUsers.add(user);
            }
        } catch (SQLException e) {
        }
        
        return listUsers;
    }
    
    @Override
    public void addUser(User user) {
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("insert into User(username,password,address) values(?,?,?)");
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getPassword());
            psmt.setString(3, user.getAddress());
            psmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    @Override
    public void updateUser(User user) {
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("update User set username = ? ,password=? , address=? where User_id = ?");
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getPassword());
            psmt.setString(3, user.getAddress());
            psmt.setInt(4, user.getUser_id());
            psmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    @Override
    public void deleteUser(int id) {
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("delete from User where User_id=? ");
            psmt.setInt(1, id);
            psmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
    @Override
    public List<User> searchUsers(String search) {
        List<User> listUsers = new ArrayList<>();
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("select * from user where username like ?");
            psmt.setString(1, "%" + search + "%");
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAddress(rs.getString(4));
                listUsers.add(user);
            }
        } catch (SQLException e) {
        }
        return listUsers;
    }
    
    @Override
    public User getById(int id) {
        User user = new User();
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("select * from User where User_id=? ");
            psmt.setInt(1, id);
            rs = psmt.executeQuery();
            while (rs.next()) {
                user.setUser_id(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setAddress(rs.getString(4));
            }
        } catch (SQLException e) {
        }
        return user;
    }

    @Override
    public int getRoleUser(String nameString,String pass) {
        int roleUser=0;
        try {
            conn = Connect.connectDB();
            psmt = conn.prepareStatement("select role_id from User where username=? and password=? ");
            psmt.setString(1, nameString);
            psmt.setString(2, pass);
            rs = psmt.executeQuery();
            while (rs.next()) {
               roleUser=rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return roleUser;
    }
    
}
