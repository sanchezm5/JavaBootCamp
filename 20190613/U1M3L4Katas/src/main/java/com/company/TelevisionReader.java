package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class TelevisionReader {
    public static void main(String[] args) {

        // Read the JSON file and print contents to the console
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Television> tvsFromJSON;

            tvsFromJSON = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});

            // Iterate through the television list and print to console
            for (Television tv : tvsFromJSON) {
                System.out.println("=========================================");
                System.out.println(tv.getBrand());
                System.out.println(tv.getModel());
                System.out.println(tv.getPrice());
                System.out.println(tv.getScreenSize());
            }
            System.out.println("=========================================");
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}

