/*
    Create a Car class. It should implement Vehicle and have the following properties and associated getters/setters:
        -String make
        -String model
        -int milesTraveled
*/

package com.company;

import com.company.interfaces.Vehicle;

// Implementing the Interface
public class Car implements Vehicle {

    // Data Members
    protected String make;
    protected String model;
    protected int milesTraveled;

    // Vehicle Methods
    public void drive(int miles) {

    }

    public void displayMilesTraveled() {

    }

    // Car Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesTraveled() {
        return milesTraveled;
    }

    public void setMilesTraveled(int milesTraveled) {
        this.milesTraveled = milesTraveled;
    }
}
