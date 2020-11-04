package com.cdac.cntr;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.User;

@RestController
public class helloController {

	@GetMapping(value = "hello")
	public String sayHello() {
		return "Hello";
	}
	@GetMapping(value ="hello1")
	public String SayHello2(@RequestParam String name) {
		return "hello "+name;
	}
	
	@DeleteMapping(value="del/{id}")
	public String deleteData(@PathVariable int id) {
		return "Deleted "+id;
	}
	
	@PostMapping(value = "add")
	public User getUser(@RequestBody User user) {
		return user;
	}
}
