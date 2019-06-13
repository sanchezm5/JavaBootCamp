/*
    Add Jackson Databind to your POM.xml file as a dependency. Create a Java file called JSONWriteAndRead and print the
    contents of carList to a JSON file. Once you've written the file, read and print out the contents.
 */

package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JSONWriteAndRead {
    public static void main(String[] args) {
        PrintWriter writer = null;
        ObjectMapper mapper = new ObjectMapper();

        // Create a list of car objects in an ArrayList
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));

        // Write a JSON file using the data from the ArrayList
        try {
            String jsonCarList = mapper.writeValueAsString(carList);

            writer = new PrintWriter(new FileWriter("car_list.json"));

            writer.println(jsonCarList);

        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }

        // Read the JSON file and print contents to the console
        try {

            List<Car> carsFromJSON;

            carsFromJSON = mapper.readValue(new File("car_list.json"), new TypeReference<List<Car>>(){});

            // Iterate through the car list and print to console
            for (Car car : carsFromJSON) {
                System.out.println("=========================================");
                System.out.println(car.getYear());
                System.out.println(car.getMake());
                System.out.println(car.getModel());
                System.out.println(car.getColor());
            }
            System.out.println("=========================================");
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}
