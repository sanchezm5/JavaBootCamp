package com.company.abstractapproach;

// Circle inherits from Shape abstract class
public class Circle extends Shape {

    // Properties
    private double radius;

    // Inherited Abstract Methods
    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
