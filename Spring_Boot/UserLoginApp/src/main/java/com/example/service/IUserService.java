package com.example.service;

import com.example.dto.User;

public interface IUserService {
	void loginUser(User user);
	User getUser(String userName,String userPassword);
}
