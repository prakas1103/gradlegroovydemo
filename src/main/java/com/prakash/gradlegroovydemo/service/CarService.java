package com.prakash.gradlegroovydemo.service;

import com.prakash.gradlegroovydemo.model.Car;
import com.prakash.gradlegroovydemo.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public int getTotalCarsByModel(String model){
        return carRepository.getTotalCarsByModel(model);
    }

    public List<Car> findCarsAfterYear(Integer year_in){
        return carRepository.findCarsAfterYear(year_in);
    }
}
