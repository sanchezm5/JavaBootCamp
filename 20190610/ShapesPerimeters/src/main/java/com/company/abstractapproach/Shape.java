/*
Abstract Class Implementation:
    Using package com.company.abstractapproach, create an abstract class called Shape. Include the same basic properties
    as before, but this time, declare the the area() and perimeter() methods as abstract. Again, create the Circle,
    Square, and Triangle classes, inheriting from the new abstract Shape class.
*/

package com.company.abstractapproach;

public abstract class Shape {

    // Shape Properties
    protected String name;
    protected String color;
    protected double xCoordinate;
    protected double yCoordinate;

    // Abstract Class Methods (cannot have body)
    public abstract double area();
    public abstract double perimeter();
}
