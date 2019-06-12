/*
    Using the starter code provided in CarLists, complete the following:
        -Create a List called toyotaList to hold all the Car variables with "Toyota" as the manufacturer and add them to the List.
        -Create a List called fordList to hold all the Car variables with "Ford" as the manufacturer and add them to the List.
        -Create a List called hondaList to hold all the Car variables with "Honda" as the manufacturer and add them to the List.
        -Store all 3 List in a Map with the manufacturer as the key.
        -Hint: Your key will be a String. What will your value be?


 */

package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarLists {

    public static void main(String[] args) {

        Car camry = new Car("Toyota", "Camry");
        Car corolla = new Car("Toyota", "Corolla");
        Car highlander = new Car("Toyota", "Highlander");

        Car mustang = new Car("Ford", "Mustang");
        Car fusion = new Car("Ford", "Fusion");
        Car taurus = new Car("Ford", "Taurus");

        Car accord = new Car("Honda", "Accord");
        Car civic = new Car("Honda", "Civic");
        Car fit = new Car("Honda", "Fit");

        // Create a toyotaList and add all Toyotas to toyotaList
        List<Car> toyotaList = new ArrayList<>();
        toyotaList.add(camry);
        toyotaList.add(corolla);
        toyotaList.add(highlander);

        // Create a fordList add all Fords to fordList
        List<Car> fordList = new ArrayList<>();
        fordList.add(mustang);
        fordList.add(fusion);
        fordList.add(taurus);

        // Create a hondaList add all Hondas to fordList
        List<Car> hondaList = new ArrayList<>();
        hondaList.add(accord);
        hondaList.add(civic);
        hondaList.add(fit);

        // Store all 3 List in a Map with the manufacturer as the key.
        Map<String, List> carsList = new HashMap<>();
        carsList.put("Toyota", toyotaList);
        carsList.put("Ford", fordList);
        carsList.put("Honda", hondaList);

    }

}
