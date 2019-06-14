/*
Televisions:
    Using the data provided in televisions.json and the code you wrote in the previous lesson, complete the following.
    Use lambdas and streams for all of these where appropriate.

    -Find all televisions with a screen size greater than 60 inches. Use the .forEach method to print out all entries.
    -Group all televisions into a Map by brand. Print out the list of manufacturers.
    -Find and display the average screenSize.
    -Find and display the largest screen.
    Challenge:
        -Sort the data by screen size, then print out the sorted list.
 */

package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TelevisionReader {
    public static void main(String[] args) {

        // Read the JSON file
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Television> televisions = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});

            // Find all televisions with a screen size greater than 60 inches
            int screenSize = 60;
            televisions
                    .stream()
                    .filter(tv -> tv.getScreenSize() > screenSize)
                    // Use the .forEach method to print out all entries
                    .forEach(tv -> {
                        System.out.println("=========================================");
                        System.out.println(tv.getBrand());
                        System.out.println(tv.getModel());
                        System.out.println(tv.getPrice());
                        System.out.println(tv.getScreenSize());
                    });

            // Group all televisions into a Map by brand.
            Map<String, List<Television>> groupedTvs =
            televisions
                    .stream()
                    .collect(Collectors.groupingBy(tv -> tv.getBrand()));

            // Print out the list of manufacturers.
            Set<String> keys = groupedTvs.keySet();
            for(String key : keys) {
                System.out.println(key);
            }
            System.out.println("----------------------------");

            // Find and display the average screenSize.
            double avgScreenSize =
            televisions
                    .stream()
                    .mapToInt(tv -> tv.getScreenSize())
                    .average()
                    .getAsDouble();

            System.out.println("Average screen-size is: " + avgScreenSize);

            // Find and display the largest screen
            int maxScreenSize =
            televisions
                    .stream()
                    .mapToInt(tv -> tv.getScreenSize())
                    .max()
                    .getAsInt();

            System.out.println("Max horsepower: " + maxScreenSize);

            // Challenge: Sort the data by screen size, then print out the sorted list
            televisions
                    .stream()
                    .sorted(Comparator.comparing(Television::getScreenSize))
                    .collect(Collectors.toList())
                    .forEach(tv -> {
                        System.out.println("=========================================");
                        System.out.println("Brand: " + tv.getBrand() + ", Model: " + tv.getModel() + ", Price: " + tv.getPrice() + ", ScreenSize: " + tv.getScreenSize());
                    });
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}
