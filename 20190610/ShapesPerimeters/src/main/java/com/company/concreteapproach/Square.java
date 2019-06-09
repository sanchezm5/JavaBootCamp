package com.company.concreteapproach;

// Square will inherit from the Shape class
public class Square extends Shape {

    // Properties
    private double side;

    // Inherited Methods
    public double area() {
        return Math.pow(side, 2);
    }

    public double perimeter() {
        return 4 * side;
    }
}
