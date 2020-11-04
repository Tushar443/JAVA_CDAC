package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Train;
import com.cdac.service.ITrainService;

@Controller
public class BookingController {

	@Autowired
	private ITrainService trainService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String bookTrainForm() {
		return "book_form";
	}

	@RequestMapping(value = "/book_train_seat.htm", method = RequestMethod.GET)
	public String bookTrainSeat() {
		return "select_train_details";
	}

	@RequestMapping(value = "/book_train_form.htm", method = RequestMethod.GET)
	public String bookTrainForm(@RequestParam int trainId, ModelMap map, HttpSession session) {
		Train train = trainService.findTrain(trainId);
		System.out.println(train + "   line 34");
		session.setAttribute("bookTrainId", trainId);
		map.put("train", train);
		System.out.println("line 37");
		return "book_form";
	}

	@RequestMapping(value = "/book_train.htm", method = RequestMethod.POST)
	public String bookTrain(@RequestParam String seatType, @RequestParam int noPassenger, ModelMap map,
			HttpSession session) {
		System.out.println(noPassenger + " " + seatType);
		int trainId = (int) session.getAttribute("bookTrainId");
		return "payment";
	}
}
