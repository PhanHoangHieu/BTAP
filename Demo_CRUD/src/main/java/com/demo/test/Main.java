/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.test;

import com.demo.connect.Connect;
import com.demo.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static Connection conn;
    static PreparedStatement psmt;
    static ResultSet rs;

    public static List<User> getAllUser() throws SQLException {
        List<User> listUsers = new ArrayList<>();
        conn = Connect.connectDB();
        psmt = conn.prepareStatement("select * from User");
        rs = psmt.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setUser_id(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setPassword(rs.getString(3));
            user.setAddress(rs.getString(4));
            listUsers.add(user);
        }
        return listUsers;
    }

    public static void addUser(User user) throws SQLException {
        conn = Connect.connectDB();
        psmt = conn.prepareStatement("insert into User(username,password,address) values(?,?,?)");
        psmt.setString(1, user.getUsername());
        psmt.setString(2, user.getPassword());
        psmt.setString(3, user.getAddress());
        psmt.executeUpdate();
    }

    public static void updateUser(User user) throws SQLException {
        conn = Connect.connectDB();
        psmt = conn.prepareStatement("update User set username = ? ,password=? , address=? where User_id = ?");
        psmt.setString(1, user.getUsername());
        psmt.setString(2, user.getPassword());
        psmt.setString(3, user.getAddress());
        psmt.setInt(4, user.getUser_id());
        psmt.executeUpdate();
    }

    public static void deleteUser(int id) throws SQLException {
        conn = Connect.connectDB();
        psmt = conn.prepareStatement("delete from User where User_id=? ");
        psmt.setInt(1, id);
        psmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        User user = new User();
        user.setUser_id(5);
        deleteUser(5);
    }
}
