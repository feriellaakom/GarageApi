package com.garage.garage_api.repository;
import com.garage.garage_api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, String> {
}


