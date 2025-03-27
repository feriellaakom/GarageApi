package com.garage.garage_api.controller;


import com.garage.garage_api.model.Car;
import com.garage.garage_api.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{immatriculation}")
    public ResponseEntity<Car> getCar(@PathVariable String immatriculation) {
        Optional<Car> car = carService.getCarById(immatriculation);
        return car.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        return ResponseEntity.ok(carService.addCar(car));
    }

    @PutMapping("/{immatriculation}")
    public ResponseEntity<Car> updateCar(@PathVariable String immatriculation, @RequestParam String etat) {
        return ResponseEntity.ok(carService.updateCar(immatriculation, etat));
    }

    @DeleteMapping("/{immatriculation}")
    public ResponseEntity<Void> deleteCar(@PathVariable String immatriculation) {
        carService.deleteCar(immatriculation);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

@GetMapping("/byModele/{modele}")
public List<Car> getCarsByModele(@PathVariable String modele) {
    return carService.getCarsByModele(modele);
}}
