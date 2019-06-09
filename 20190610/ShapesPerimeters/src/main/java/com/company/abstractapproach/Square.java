package com.company.abstractapproach;

// Square inherits form Shape abstract class
public class Square extends Shape {

    // Properties
    private double side;

    // Inherited Abstract Methods
    public double area() {
        return Math.pow(side, 2);
    }

    public double perimeter() {
        return 4 * side;
    }
}
