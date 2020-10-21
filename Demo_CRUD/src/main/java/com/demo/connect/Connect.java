/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThanhNguyen
 */
public class Connect {
    static Connection conn;
    public static Connection connectDB() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Account","root","root");
        return conn;
    }
    public static void main(String[] args) throws SQLException {
        if (connectDB() !=null) {
            System.out.println("thành công");
        }
        else
            System.out.println("thất bại");
    }
}
