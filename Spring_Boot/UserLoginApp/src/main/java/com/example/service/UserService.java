package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.User;
import com.example.repo.UserRepo;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepo userRepo;
	@Override
	public void loginUser(User user) {
		userRepo.save(user);		
	}

	@Override
	public User getUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
