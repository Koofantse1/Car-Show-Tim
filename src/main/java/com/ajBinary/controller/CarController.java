package com.ajBinary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajBinary.entity.Car;
import com.ajBinary.service.CarService;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {
    @Autowired
    private CarService carService;

  @GetMapping("/all")
    public ResponseEntity<List<Car>> getCars(){
     return new ResponseEntity<>(carService.getCars(), HttpStatus.OK);
  }    
     @GetMapping("/{id}")
     public ResponseEntity<Car> getCar( @PathVariable Long id){
     return new ResponseEntity<>(carService.getCarById(id),HttpStatus.OK);
 
    }
}