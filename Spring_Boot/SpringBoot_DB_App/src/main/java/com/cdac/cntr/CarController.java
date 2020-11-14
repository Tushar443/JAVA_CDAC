package com.cdac.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.Car;
import com.cdac.service.CarService;
 
@RestController
@SpringBootApplication
@CrossOrigin(origins = "*")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping(value = "car_add")
	public String carAdd(@RequestBody Car car) {
		carService.addCar(car);
		return "success";
	}

	@PostMapping(value = "car_del/{id}")
	public String carDelete(@PathVariable int id) {
		carService.removeCar(id);
		return "success";
		
	}
	
	@PostMapping(value = "car_list")
	public List<Car> carList() {
		return carService.getAll();	
	}
	
	
	@GetMapping(value = "get_car/{id}")
	public Car getCar(@PathVariable int id) {
		return carService.getCar(id);
	}
	
	
	@PutMapping(value = "car_update")
	public String carUpdate(@RequestBody Car car) {
		carService.modifyCar(car);
		return "success";
	}
	
}
