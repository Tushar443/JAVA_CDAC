package com.cdac.dao;

import com.cdac.dto.User;

public interface IUserDao {
	void insertUser(User user);

	User checkUser(User user);
}
