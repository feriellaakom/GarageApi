package com.garage.garage_api.service;
import com.garage.garage_api.model.Car;
import com.garage.garage_api.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Optional<Car> getCarById(String immatriculation) {
        return carRepository.findById(immatriculation);
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(String immatriculation, String newEtat) {
        return carRepository.findById(immatriculation).map(car -> {
            car.setEtat(newEtat);
            return carRepository.save(car);
        }).orElseThrow(() -> new RuntimeException("Voiture non trouvée"));


    }


    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    public void deleteCar(String immatriculation) {
        carRepository.deleteById(immatriculation);
    }

public List<Car> getCarsByModele(String modele) {
    return carRepository.findByModele(modele);
}
}
