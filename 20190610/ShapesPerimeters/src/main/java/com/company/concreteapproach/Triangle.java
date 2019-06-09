package com.company.concreteapproach;

public class Triangle {

    // Properties
    private double sideA;
    private double sideB;
    private double sideC;

    // Inherited Methods
    public double area() {
        double p = perimeter() / 2;

        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p-sideC));
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
