package com.company.MariaSanchezCarLotJpaRepository;

import com.company.MariaSanchezCarLotJpaRepository.dao.CarRepository;
import com.company.MariaSanchezCarLotJpaRepository.dto.Car;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MariaSanchezCarLotJpaRepositoryApplicationTests {

	@Autowired
	CarRepository carRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void addCar() {

		Car car = new Car();
		car.setMake("Honda");
		car.setModel("Civic");
		car.setColor("Red");
		car.setYear("2000");

		car = carRepo.save(car);
		Optional<Car> newCar = carRepo.findById(car.getId());

		Assert.assertEquals(newCar.get(), car);
	}
}
