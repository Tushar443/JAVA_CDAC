package com.cdac.dao;

import com.cdac.dto.User;

public interface IUserDao {
	boolean insertUser(User user);

	boolean checkUser(User user);

	boolean checkAdmin(User user);
}
