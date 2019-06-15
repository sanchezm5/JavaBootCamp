package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInventory {
    Scanner scanner = new Scanner(System.in);

    List<Car> carList = new ArrayList<>();

    private String model;
    private String make;
    private String year;
    private String color;
    private int miles;

    // return type?
    public void add() {
        System.out.println("Enter make: " + make);
        make = scanner.nextLine();
        System.out.println("Enter model: " + model);
        model = scanner.nextLine();
        System.out.println("Enter year: " + year);
        year = scanner.nextLine();
        System.out.println("Enter color: " + color);
        color = scanner.nextLine();
        System.out.println("Enter miles on odometer: " + miles);
        String userInput = scanner.nextLine();
        miles = Integer.parseInt(userInput);

        Car newCar = new Car(model, make, year, color, miles);
        carList.add(newCar);
    }

    public void delete() {

    }

    public void list () {

    }

    public void search () {

    }
}
