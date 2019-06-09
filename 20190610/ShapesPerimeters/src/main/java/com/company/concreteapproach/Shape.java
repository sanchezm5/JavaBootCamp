/*
Concrete Class Implementation:
    Using package com.company.concreteapproach, create a basic class called Shape. Include properties for name, color,
    x coordinate, and y coordinate. Also provide an empty implementation for area() and perimeter() methods.
    Once you have the Shape class created, create the below classes. Each class will inherit from the Shape class.
    Each should have properties appropriate to them, and an implementation for area() and perimeter().
        -Circle
        -Square
        -Triangle
*/

package com.company.concreteapproach;

public class Shape {

    // Shape Properties
    protected String name;
    protected String color;
    protected double xCoordinate;
    protected double yCoordinate;

    // Class Methods
    public double area() {
        return 0.00;
    }

    public double perimeter() {
        return 0.00;
    }

}
