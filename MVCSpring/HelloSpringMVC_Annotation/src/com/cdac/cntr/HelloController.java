package com.cdac.cntr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
@Controller
public class HelloController {

	@RequestMapping(value = "/hello.htm",method = RequestMethod.GET)
	public String sayHello() {
		return "info";
	}
	

}
