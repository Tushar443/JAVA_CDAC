package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.User;
import com.cdac.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/prep_reg_form.htm", method = RequestMethod.GET)
	public String preRegForm(ModelMap map) {
		map.put("user", new User());
		return "reg_form";
	}

	@RequestMapping(value = "/reg.htm", method = RequestMethod.POST)
	public String register(User user, ModelMap map) {
		userService.addUser(user);
		return "index";
	}
}
