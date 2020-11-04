package com.cdac.cntr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.service.IUserService;

@Controller
public class PaymentController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/payment.htm", method = RequestMethod.GET)
	public String payment(ModelMap map) {
		return "";
	}
}
