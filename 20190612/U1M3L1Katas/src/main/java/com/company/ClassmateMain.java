/*
    Complete the following steps to create a List to hold information about your classmates.
    -Create a Classmate class, which has the properties name and hairColor.
    -Create a new List to hold Classmate objects.
    -Add at least 5 Classmate objects to the list.
    -Print out the name and hair color for every object in the list.
 */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassmateMain {
    public static void main(String[] args) {
        // Create a list of Classmates
        List<Classmate> classmate = new ArrayList<>();

        // Create at least 5 classmate objects
        Classmate student1 = new Classmate("Perri Love", "black");
        Classmate student2 = new Classmate("Michael Cirincione", "blonde");
        Classmate student3 = new Classmate("Eric Han", "black");
        Classmate student4 = new Classmate("Amorita Christian", "black");
        Classmate student5 = new Classmate("Rebecca Anderson", "black");

        // Add each of the objects to the classmate list
        classmate.add(student1);
        classmate.add(student2);
        classmate.add(student3);
        classmate.add(student4);
        classmate.add(student5);

        // Print out the name and hair color for every object in the list
        for (Classmate student : classmate) {
            System.out.println("Name: " + student.getName() + ", Hair Color: " + student.getHairColor());
        }
    }
}
