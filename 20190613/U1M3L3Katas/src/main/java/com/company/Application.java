/*
    Using the starter code, handle the follow exceptions in Application:

        -When a user enters a non-integer value, display "Please enter a valid number."
        -When a user chooses a value not present in the array, display "Please choose an available pet."
        -If the file does not exist, display that information to the user.
        -If there was trouble writing the file, display that information.
        -Regardless of success or exceptions, tell the user to "Have a nice day!"

 */

package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        try {
            int petIndex = Pets.choosePet();

            String chosenPet = Pets.retrievePet(petIndex);

            Pets.readPetsFromFile();

            Pets.writePetToFile(chosenPet);

        } catch (NumberFormatException e) {
            // When a user enters a non-integer value, have them enter a valid number
            System.out.println("Please enter a valid number.");

        } catch (ArrayIndexOutOfBoundsException e) {
            // When a user chooses a value not present in the array, display "Please choose an available pet."
            System.out.println("Please choose an available pet.");

        } catch (FileNotFoundException e) {
            // If the file does not exist, display that information to the user.
            System.out.println("This file does not exist.");

        } catch (IOException e) {
            // If there was trouble writing the file, display that information.
            System.out.println("There was trouble writing the file.");

        } finally {
            // Regardless of success or exceptions, tell the user to "Have a nice day!"
            System.out.println("Have a nice day!");
        }
    }
}
