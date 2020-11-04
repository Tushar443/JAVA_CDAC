package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Train;
import com.cdac.dto.User;
import com.cdac.service.ITrainService;
import com.cdac.service.IUserService;

@Controller
public class BookingController {

	@Autowired
	private ITrainService trainService;
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/book_train_seat.htm", method = RequestMethod.GET)
	public String bookTrainSeat(ModelMap map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		map.put("user", user);
		return "select_train_details";
	}

	@RequestMapping(value = "/book_train_form.htm", method = RequestMethod.GET)
	public String bookTrainForm(@RequestParam int trainId, ModelMap map, HttpSession session) {
		Train train = trainService.findTrain(trainId);
		session.setAttribute("bookTrainId", trainId);
		map.put("train", train);
		return "book_form";
	}

	@RequestMapping(value = "/book_train.htm", method = RequestMethod.POST)
	public String bookTrain(User user, ModelMap map, HttpSession session) {
		int trainId = (int) session.getAttribute("bookTrainId");
		User user12 = (User) session.getAttribute("user");
		userService.modifyUser(user.getSeatType(), user.getNoOfPassengers(), 1111, user12.getUserId());
		return "payment";
	}
}
