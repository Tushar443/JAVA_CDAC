package com.service;

import com.dao.IUserDao;
import com.dao.UserImple;
import com.dto.User;

public class ServiceImple implements IService {
	private IUserDao userDao;
	
	public ServiceImple() {
		userDao = new UserImple();
	}

	@Override
	public int registerUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

}
