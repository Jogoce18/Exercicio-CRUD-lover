package crudlover.api.controllers;

import crudlover.api.entities.Car;
import crudlover.api.entities.CarUpdateRequest;
import crudlover.api.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cars")
public class CarController {

    @Autowired
    CarService service;
    @PostMapping(value = "add")
    public String addCar(@RequestBody Car car){
        service.insertData(car);
        return "Carro adicionado!";
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getAllCars();
    }

    @PutMapping(value = "/update/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody CarUpdateRequest car) {
        return service.updateData(id, car);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        service.remove(id);
        return "Car deleted";
    }
}
