package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.User;
import com.cdac.service.IUserService;

@Controller
public class PaymentController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/payment.htm", method = RequestMethod.GET)
	public String payment(ModelMap map, HttpSession session) {
		int trainId = (int) session.getAttribute("bookTrainId");
		User user12 = (User) session.getAttribute("user");
		System.out.println(user12 + "   pay23");
		userService.modifyUser(user12.getSeatType(), user12.getNoOfPassengers(), user12.getTotalPrice(), trainId,
				user12.getUserId());
		return "home";
	}
}
