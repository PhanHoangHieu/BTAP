package com.fruits.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fruits.dao.UserDao;
import com.fruits.model.User;
import com.fruits.utils.*;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAll() {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM users";
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFullname(rs.getString("fullname"));
				user.setEmail(rs.getString("email"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getInt("role"));
				userList.add(user);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return userList;
	}

	@Override
	public User findUserByNameAndPassword(String userName, String password) {
		List<User> userList = new ArrayList<User>();
        String sql = "SELECT * FROM users Where username = '" + userName +"'" + " AND password = '" + password + "'";
        Connection conn;
        try {
                conn = ConnectionUtils.getMyConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                        User user = new User();
                        user.setId(rs.getInt("id"));
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        user.setRole(rs.getInt("role"));

                        userList.add(user);
                }
        } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
        }
        if (!userList.isEmpty() && userList.size() > 0) {
                // return username dau tien duoc tim thay
                return userList.get(0);
        }
        return null;
	}

	@Override
	public User findUserById(int id) {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM users Where id = " + id;
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFullname(rs.getString("fullname"));
				user.setEmail(rs.getString("email"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getInt("role"));
				userList.add(user);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (!userList.isEmpty() && userList.size() > 0) {
			// return username dau tien duoc tim thay
			return userList.get(0);
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		String sql = "UPDATE users SET " + "fullname = '" + user.getFullname() + "'," + "email = '" + user.getEmail() + "'"
				+ " WHERE id = " + user.getId();
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void addUser(User user) {
		String sql = "Insert into users(fullname, email, username, password, role) VALUES(" + "'" + user.getFullname()
				+ "'," + "'" + user.getEmail() + "'," + "'" + user.getUsername() + "'," + "'" + user.getPassword()
				+ "'," + user.getRole() + ")";
		Connection conn;
		try {
			conn = ConnectionUtils.getMyConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void deleteUser(int id) {
		String sql = "DELETE FROM users WHERE id = " + id;
        Connection conn;
        try {
                conn = ConnectionUtils.getMyConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.executeUpdate();

        } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
        }

	}

}
