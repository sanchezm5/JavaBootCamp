package com.company.concreteapproach;

// Circle will inherit from Shape class
public class Circle extends Shape {

    // Properties
    private double radius;

    // Inherited Methods
    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
