package com.cdac.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
