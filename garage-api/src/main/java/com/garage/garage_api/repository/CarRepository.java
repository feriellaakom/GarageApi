package com.garage.garage_api.repository;
import com.garage.garage_api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> findByModele(String modele);
}


