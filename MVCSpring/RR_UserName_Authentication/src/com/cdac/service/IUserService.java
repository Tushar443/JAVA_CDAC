package com.cdac.service;

import com.cdac.dto.User;

public interface IUserService {
	boolean addUser(User user);

	boolean findUser(User user);

	boolean findAdmin(User user);
}
