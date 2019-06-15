/**
 * Converter If:
 * In this exercise you will create two different implementations of the following interface.
 * The first implementation must use if/else/else if statements and be called ConverterIf.
 */

package com.company;

import com.company.interfaces.Converter;

// Implementing the interface
public class ConverterIf implements Converter {

    // Converter Month Method Implementation
    public String converterMonth(int monthNumber) {

        // Declare a variable to represent the month converter message to be printed out to the user
        String monthMessage = "(From ConverterIf) Your number corresponds to the month of ";

        // Using if/else/else-if logic, match the number entered with the correct corresponding month
        if (monthNumber == 1) {
            return monthMessage + "January.";
        } else if (monthNumber == 2) {
            return monthMessage + "February.";
        } else if (monthNumber == 3) {
            return monthMessage + "March.";
        } else if (monthNumber == 4) {
            return monthMessage + "April.";
        } else if (monthNumber == 5) {
            return monthMessage + "May.";
        } else if (monthNumber == 6) {
            return monthMessage + "June.";
        } else if (monthNumber == 7) {
            return monthMessage + "July.";
        } else if (monthNumber == 8) {
            return monthMessage + "August.";
        } else if (monthNumber == 9) {
            return monthMessage + "September.";
        } else if (monthNumber == 10) {
            return monthMessage + "October.";
        } else if (monthNumber == 11) {
            return monthMessage + "November.";
        } else if (monthNumber == 12) {
            return monthMessage + "December.";

        // Print an error message if the user enters an invalid entry
        } else {
            return "(From ConverterIf) You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.";
        }
    }

    // Converter Day Method Implementation
    public String convertDay(int dayNumber) {

        // Declare a variable to represent the day converter message to be printed out to the user
        String dayMessage = "(From ConverterIf) Your number corresponds to this day of the week: ";

        // Using if/else/else-if logic, match the number entered with the correct corresponding day
        if (dayNumber == 1) {
            return dayMessage + "Sunday";
        } else if (dayNumber == 2) {
            return dayMessage + "Monday";
        } else if (dayNumber == 3) {
            return dayMessage + "Tuesday";
        } else if (dayNumber == 4) {
            return dayMessage + "Wednesday";
        } else if (dayNumber == 5) {
            return dayMessage + "Thursday";
        } else if (dayNumber == 6) {
            return dayMessage + "Friday";
        } else if (dayNumber == 7) {
            return dayMessage + "Saturday";

        // Print an error message if the user enters an invalid entry
        } else {
            return "(From ConverterIf) You have entered an invalid number. You must enter a number between 1 and 7. Goodbye.";
        }
    }
}
