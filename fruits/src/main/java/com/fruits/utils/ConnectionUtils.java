/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fruits.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author TechCare
 */
public class ConnectionUtils {
	public static Connection connection; 
	public static synchronized Connection getMyConnection() {
		if(connection!=null) {
			return connection;
		}else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/fruits";
				String user = "root";
				String pass = "206189323";
				try {
					connection = (Connection) DriverManager.getConnection(url,user,pass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}


}
