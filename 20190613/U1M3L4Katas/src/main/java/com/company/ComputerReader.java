package com.company;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class ComputerReader {
    public static void main(String[] args) {
        try {
            // Read the csv file and print contents to the console
            List<Computer> computersFromCSV =
                    new CsvToBeanBuilder<Computer>(new FileReader("computers.csv")).withType(Computer.class).build().parse();

            // Iterate through the computer list and print to console
            for (Computer computer : computersFromCSV) {
                System.out.println("=========================================");
                System.out.println(computer.getBrand());
                System.out.println(computer.getModel());
                System.out.println(computer.getCpu());
                System.out.println(computer.getRam());
                System.out.println(computer.getStorageSize());
            }
            System.out.println("=========================================");
        } catch (Exception e) {
            System.out.println("An error occurred " + e);
        }
    }
}
