package com.cdac.service;

import java.util.List;

import com.cdac.dto.Car;

public interface CarService {

	void addCar(Car car);
	void removeCar(int id);
	Car getCar(int id);
	void modifyCar(Car car);
	List<Car> getAll();
}
