package com.cdac.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdac.dto.Train;
import com.cdac.service.ITrainService;

@Controller
public class TrainController {
	@Autowired
	private ITrainService trainService;

	@RequestMapping(value = "/add_train.htm", method = RequestMethod.GET)
	public String reqAddTrain(ModelMap map) {
		map.put("train", new Train());
		return "train_form";
	}

	@RequestMapping(value = "/train_add_form.htm", method = RequestMethod.POST)
	public String addTrain(Train train, ModelMap map) {
		trainService.addTrain(train);
		return "index";
	}

	@RequestMapping(value = "/search.htm", method = RequestMethod.GET)
	public String searchTrain(Train train, ModelMap map) {
		List<Train> list = trainService.selectAll();
		map.put("tList", list);
		return "allTrain";
	}
}
