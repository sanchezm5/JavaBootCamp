/*
Computers:
    -Open computers.csv and look at the data within.
    -Create an appropriate Java object based on the contents of the file.
    -Create a Java file called ComputerReader.
    -Use OpenCSV to read the data from the file and store it in a list.
    -Print the contents of the list.
 */

package com.company;

import com.opencsv.bean.CsvBindByName;

// Create a Computers Class
public class Computer {

    // Properties
    @CsvBindByName(column = "Brand")
    private String brand;
    @CsvBindByName(column = "Model")
    private String model;
    @CsvBindByName(column = "CPU")
    private String cpu;
    @CsvBindByName(column = "RAM")
    private int ram;
    @CsvBindByName(column = "StorageSize")
    private int storageSize;

    // Constructor
    public Computer(String brand, String model, String cpu, int ram, int storageSize) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storageSize = storageSize;
    }

    public Computer () {

    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

}
