/*
    Create an Accord class. It should extend Sedan and have the following properties and associated getters/setters:
        -String year
        -Engine engine
        -Transmission transmission
*/

package com.company;

// Accord inherits from Sedan (Inheritance)
// Accord "has an" engine and it "has a" transmission (Composition)
public class Accord extends Sedan {

    // Private Data Members
    private String year;

    // Other Class Data Members
    private Engine engine;
    private Transmission transmission;

    // Accord Getters and Setters
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Other Class Getters and Setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
