package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.IUserDao;
import com.cdac.dto.User;

@Service
public class UserServiceImple implements IUserService {
	@Autowired
	private IUserDao userDao;

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public boolean findUser(User user) {

		return userDao.checkUser(user);

	}

	@Override
	public boolean findAdmin(User user) {
		return userDao.checkAdmin(user);
	}

}
