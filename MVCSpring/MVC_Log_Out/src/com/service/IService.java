package com.service;

import com.dto.User;

public interface IService {
	int registerUser(User user);
	boolean login(User user);
}
