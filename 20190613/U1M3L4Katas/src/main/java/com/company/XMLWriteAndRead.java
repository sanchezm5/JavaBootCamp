/*
    Add Jackson Data Format XML to your POM.xml file as a dependency. Create a Java file called XMLWriteAndRead and print
    the contents of carList to an XML file. Once you've written the file, read and print out the contents.
 */

package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class XMLWriteAndRead {
    public static void main(String[] args) {
        PrintWriter writer = null;
        ObjectMapper mapper = new XmlMapper();

        // Create a list of car objects in an ArrayList
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));

        // Write an xml file using the data from the ArrayList
        try {
            String xmlCarList = mapper.writeValueAsString(carList);

            writer = new PrintWriter(new FileWriter("car_list.xml"));

            writer.println(xmlCarList);

        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }

        // Read the xml file and print contents to the console
        try {

            List<Car> carsFromXml;

            carsFromXml= mapper.readValue(new File("car_list.xml"), new TypeReference<List<Car>>(){});

            // Iterate through the car list and print to console
            for (Car car : carsFromXml) {
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
