package com.prakash.gradlegroovydemo.controller;

import com.prakash.gradlegroovydemo.model.Car;
import com.prakash.gradlegroovydemo.model.Employee;
import com.prakash.gradlegroovydemo.service.CarService;
import com.prakash.gradlegroovydemo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{model}")
    public ResponseEntity<Integer> getTotalCarsByModel(@PathVariable String model){
        int count = carService.getTotalCarsByModel(model);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
    @GetMapping("/year/{year}")
    public ResponseEntity<List> findCarsAfterYear(@PathVariable int year){
        List<Car> carList= carService.findCarsAfterYear(year);
        return new ResponseEntity<>(carList,HttpStatus.OK);
    }

}
