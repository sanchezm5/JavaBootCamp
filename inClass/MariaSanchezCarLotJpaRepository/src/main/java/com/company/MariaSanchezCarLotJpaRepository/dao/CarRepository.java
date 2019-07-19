package com.company.MariaSanchezCarLotJpaRepository.dao;

import com.company.MariaSanchezCarLotJpaRepository.dto.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findByMake(String make);

    List<Car> findByColor(String color);
}
