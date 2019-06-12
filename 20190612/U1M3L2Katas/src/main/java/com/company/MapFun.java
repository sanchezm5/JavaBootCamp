/*
    In a Java file called MapFun complete the following:
        -Create a HashMap with a string key and integer value
        -Add the following key value pairs to the Map

            Key	            Value
            Toyota Camry	2012
            Chevy Camaro	1969
            Hyundai Genesis	2015
            Jeep Wrangler	2003
            Honda Civic	    2018
            Toyota Supra	1995
            Pontiac GTO	    1964

        -Print out all key/value pairs in the Map

        -Add two new entries to the Map - a 2012 Ford Explorer and a 2013 Smart Fortwo.

        -Print out all key/value pairs in the Map

        -Remove the Jeep Wrangler from the Map

        -Print out all key/value pairs in the Map
 */

package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFun {
    public static void main(String[] args) {

        // Create a HashMap
        Map<String, Integer> cars = new HashMap<>();

        // Add key/value pairs to the map
        cars.put("Toyota Camry", 2012);
        cars.put("Chevy Camaro", 1969);
        cars.put("Hyundai Gebesis", 2015);
        cars.put("Jeep Wrangler", 2003);
        cars.put("Honda Civic", 2018);
        cars.put("Toyota Supra", 1995);
        cars.put("Pontiac GTO", 1964);

        // Iterate through the entry set to print both the keys and values
        Set<Map.Entry<String, Integer>> myEntries = cars.entrySet();

        for(Map.Entry<String, Integer> entry :myEntries) {
            System.out.println("KEY: " + entry.getKey() + ",  VALUE: " + entry.getValue());
        }

        // Add two new entries to the map
        cars.put("Ford Explorer", 2012);
        cars.put("Smart Fortwo", 2013);

        // Iterate through the entry set to print both the keys and values
        System.out.println("\nList of key/value paris with more entries: \n");
        for(Map.Entry<String, Integer> entry :myEntries) {
            System.out.println("KEY: " + entry.getKey() + ",  VALUE: " + entry.getValue());
        }

        // Remove an entry and then reprint map
        cars.remove("Jeep Wrangler");

        System.out.println("\nList of key/value paris without an entry: \n");
        for(Map.Entry<String, Integer> entry :myEntries) {
            System.out.println("KEY: " + entry.getKey() + ",  VALUE: " + entry.getValue());
        }
    }
}
