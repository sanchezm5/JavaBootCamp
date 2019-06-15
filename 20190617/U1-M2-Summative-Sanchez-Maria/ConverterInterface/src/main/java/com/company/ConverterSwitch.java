/**
 * Converter Switch:
 * In this exercise you will create two differnt implementations of the following interface.
 * The first implementation must use if/else/else if statements and be called ConverterIf.
 * The second implementation must use switch statements and be called ConverterSwitch.
 */

package com.company;

import com.company.interfaces.Converter;

// Implementing the interface
public class ConverterSwitch implements Converter {

    // Converter Month Method Implementation
    public String converterMonth(int monthNumber) {
        // Declare a variable to represent the month converter message to be printed out to the user
        String monthMessage = "(From ConverterSwitch) Your number corresponds to the month of ";

        // Using a switch statement, match the number entered with the correct corresponding month
        switch (monthNumber) {
            case 1:
                return monthMessage + "January";
            case 2:
                return monthMessage + "February.";
            case 3:
                return monthMessage + "March.";
            case 4:
                return monthMessage + "April.";
            case 5:
                return monthMessage + "May.";
            case 6:
                return monthMessage + "June.";
            case 7:
                return monthMessage + "July.";
            case 8:
                return monthMessage + "August.";
            case 9:
                return monthMessage + "September.";
            case 10:
                return monthMessage + "October.";
            case 11:
                return monthMessage + "November.";
            case 12:
                return monthMessage + "December.";

            // Print an error message if the user enters an invalid entry
            default:
                return "(From ConverterSwitch) You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.";
        }
    }

    // Converter Day Method Implementation
    public String convertDay(int dayNumber) {
        // Declare a variable to represent the day converter message to be printed out to the user
        String dayMessage = "(From ConverterSwitch) Your number corresponds to this day of the week: ";

        // Using a switch statement, match the number entered with the correct corresponding day
        switch (dayNumber) {
            case 1:
                return dayMessage + "Sunday";
            case 2:
                return dayMessage + "Monday";
            case 3:
                return dayMessage + "Tuesday";
            case 4:
                return dayMessage + "Wednesday";
            case 5:
                return dayMessage + "Thursday";
            case 6:
                return dayMessage + "Friday";
            case 7:
                return dayMessage + "Saturday";

            // Print an error message if the user enters an invalid entry
            default:
                return "(From ConverterSwitch) You have entered an invalid number. You must enter a number between 1 and 7. Goodbye.";
        }
    }
}
