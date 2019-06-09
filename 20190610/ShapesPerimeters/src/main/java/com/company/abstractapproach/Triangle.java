package com.company.abstractapproach;

// Triangle inherits from Shape abstract class
public class Triangle extends Shape {

    // Properties
    private double sideA;
    private double sideB;
    private double sideC;

    // Inherited Abstract Methods
    public double area() {
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p-sideC));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
