package com.ajBinary.service;

import java.util.List;

import com.ajBinary.entity.Car;

public interface CarService {
	public List<Car> getCars();
	Car saveCar(Car car);
	Car updateCar(Long id, Car car);
	void deleteCar(Long id);

	Car getCarById(Long id);

}
