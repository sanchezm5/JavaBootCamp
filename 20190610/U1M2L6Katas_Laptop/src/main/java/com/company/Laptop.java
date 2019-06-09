/*
Laptop:
    Create a class representing a laptop. It should be comprised of the below objects. Add any additional objects that
    you feel should be modeled as well. Each object should have state and behavior appropriate to them.
    Start by first creating a UML diagram. Then, using that as your guide, write the code for the class.
        -Processor
        -Memory
        -Optical Drive
        -Etc.
*/

package com.company;

public class Laptop {

    // Private Data Member(s)
    private String brandLaptop;
    private int screenSize;
    private String color;

    // Other Class Data Member(s)
    private Processor brandProcessor;
    private Processor model;

    private OpticalDrive driveType;
    private OpticalDrive brandOptDrive;
    private OpticalDrive isExternal;

    private Memory numOfGB;

    // Class Method(s)
    public String changeColor(String newColor) {
        return newColor;
    }

    // Class Getters and Setters
    public String getBrandLaptop() {
        return brandLaptop;
    }

    public void setBrandLaptop(String brandLaptop) {
        this.brandLaptop = brandLaptop;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Other Class Getters and Setters
    public Processor getBrandProcessor() {
        return brandProcessor;
    }

    public void setBrandProcessor(Processor brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    public Processor getModel() {
        return model;
    }

    public void setModel(Processor model) {
        this.model = model;
    }

    public OpticalDrive getDriveType() {
        return driveType;
    }

    public void setDriveType(OpticalDrive driveType) {
        this.driveType = driveType;
    }

    public OpticalDrive getBrandOptDrive() {
        return brandOptDrive;
    }

    public void setBrandOptDrive(OpticalDrive brandOptDrive) {
        this.brandOptDrive = brandOptDrive;
    }

    public OpticalDrive getIsExternal() {
        return isExternal;
    }

    public void setIsExternal(OpticalDrive isExternal) {
        this.isExternal = isExternal;
    }

    public Memory getNumOfGB() {
        return numOfGB;
    }

    public void setNumOfGB(Memory numOfGB) {
        this.numOfGB = numOfGB;
    }
}
