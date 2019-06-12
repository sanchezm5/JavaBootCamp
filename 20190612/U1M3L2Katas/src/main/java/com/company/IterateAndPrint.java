/*
    -Using the starter code provided in IterateAndPrint, iterate through and print out all keys in the Map.
    -Using the starter code provided in IterateAndPrint, iterate through and print out all values in the Map.
    -Using the starter code provided in IterateAndPrint, iterate through the Entry Set of the Map and print both
     the keys and values in the Map.
 */

package com.company;

import java.util.*;

public class IterateAndPrint {

    public static void main(String[] args) {

        Map<String, String> baseballTeam = new HashMap<>();

        baseballTeam.put("Pitcher", "Mike Foltynewicz");
        baseballTeam.put("Catcher", "Brian McCann");
        baseballTeam.put("First Baseman", "Freddie Freeman");
        baseballTeam.put("Second Baseman", "Ozzie Albies");
        baseballTeam.put("Third Baseman", "Josh Donaldson");
        baseballTeam.put("Shortstop", "Dansby Swanson");
        baseballTeam.put("Left Fielder", "Ronald Acuna, Jr.");
        baseballTeam.put("Center Fielder", "Ender Inciarte");
        baseballTeam.put("Right Fielder", "Nick Markakis");

        // Access the keys in the map
        Set<String> keys = baseballTeam.keySet();

        // Iterate and print the keys in the map and all of the values
        for(String key : keys) {
            System.out.println("Map Keys: " + key + ", Values: " + baseballTeam.get(key));
        }

        // Iterate through the entry set to print both the keys and values
        Set<Map.Entry<String, String>> myEntries = baseballTeam.entrySet();

        for(Map.Entry<String, String> entry :myEntries) {
            System.out.println("KEY - " + entry.getKey() + ",  VALUE - " + entry.getValue());
        }
    }

}