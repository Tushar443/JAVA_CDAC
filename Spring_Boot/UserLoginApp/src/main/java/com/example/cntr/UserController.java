package com.example.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.User;
import com.example.service.IUserService;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private IUserService userService; 
	
	@PostMapping(value = "userAdd")
	public String AddUser(@RequestBody User user) {
		userService.loginUser(user);
		return "User Added";
	}

	@GetMapping(value = "getData")
	public String getData() {
		return "Success";
	}
}
