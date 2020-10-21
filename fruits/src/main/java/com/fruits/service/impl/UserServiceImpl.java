package com.fruits.service.impl;

import java.util.List;

import com.fruits.dao.UserDao;
import com.fruits.dao.impl.UserDaoImpl;
import com.fruits.model.User;
import com.fruits.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public User getUserByNameAndPass(String userName, String password) {
		User user = userDao.findUserByNameAndPassword(userName, password);
        return user;
	}

	@Override
	public User getUserById(int id) {
		User user = userDao.findUserById(id);
		return user;
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);

	}

	@Override
	public boolean isAdmin(int role) {
		if (role == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkLogin(User user) {
		if (user != null && user.getUsername() != null && !user.getUsername().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
