package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Train;
import com.cdac.dto.User;
import com.cdac.service.ITrainService;
import com.cdac.service.IUserService;

@Controller
public class PaymentController {
	@Autowired
	private IUserService userService;

	@Autowired
	private ITrainService trainService;

	@RequestMapping(value = "/payment.htm", method = RequestMethod.GET)
	public String payment(ModelMap map, HttpSession session) {
		int trainId = (int) session.getAttribute("bookTrainId");
		User user12 = (User) session.getAttribute("user");
		userService.modifyUser(user12.getSeatType(), user12.getNoOfPassengers(), user12.getTotalPrice(), trainId,
				user12.getUserId());
		Train train = trainService.findTrain(trainId);
		int seats = 0;
		String search = user12.getSeatType();
		switch (search) {
		case "gen":
			seats = train.getGen();
			seats = subtractSeat(seats, user12.getNoOfPassengers());
			trainService.modifySeats(trainId, seats, "gen");
			break;
		case "ac1":
			seats = train.getAc1();
			seats = subtractSeat(seats, user12.getNoOfPassengers());
			trainService.modifySeats(trainId, seats, "ac1");
			break;
		case "ac2":
			seats = train.getAc2();
			seats = subtractSeat(seats, user12.getNoOfPassengers());
			trainService.modifySeats(trainId, seats, "ac2");
			break;

		case "fc":
			seats = train.getFc();
			seats = subtractSeat(seats, user12.getNoOfPassengers());
			trainService.modifySeats(trainId, seats, "fc");
			break;
		case "slp":
			seats = train.getSlp();
			seats = subtractSeat(seats, user12.getNoOfPassengers());
			trainService.modifySeats(trainId, seats, "slp");
			break;
		}

		return "home";
	}

	private int subtractSeat(int seats, int passengers) {
		return seats - passengers;
	}
}
