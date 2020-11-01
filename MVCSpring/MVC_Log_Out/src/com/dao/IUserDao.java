package com.dao;

import com.dto.User;

public interface IUserDao {
	int insertUser(User user);
	boolean login(User user);
}
