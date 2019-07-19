package com.company.MariaSanchezCarLotJpaRepository.controller;

import com.company.MariaSanchezCarLotJpaRepository.dao.CarRepository;
import com.company.MariaSanchezCarLotJpaRepository.dto.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepo;

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    @ResponseBody
    public Car createCar(@RequestBody Car car) {
        carRepo.save(car);
        return car;
    }

    @RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
    public Car getCarById(@PathVariable(name="id") int id) {
        return carRepo.findById(id).get();
    }

    @RequestMapping(value="/car/{id}", method = RequestMethod.PUT)
    public void updateCar(@RequestBody Car car, @PathVariable(name = "id") int id) {

        carRepo.save(car);
    }

    @RequestMapping(value="/car/{id}", method = RequestMethod.DELETE)
    public void deleteCar(@PathVariable(name = "id") int id) {
        carRepo.delete(getCarBy);
    }

    @RequestMapping(value="/car", method = RequestMethod.GET)
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    @RequestMapping(value="/car/{make}", method = RequestMethod.GET)
    public List<Car> getCarByMake(@PathVariable(name="make") String make) {
        return carRepo.findByMake(make);
    }

    @RequestMapping(value="/car/{color}", method = RequestMethod.GET)
    public List<Car> getCarByColor(@PathVariable(name="color") String color) {
        return carRepo.findByColor(color);
    }
}
