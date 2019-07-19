package com.company.MotoInventoryJDBCTemplateDAO.model;

import java.util.Objects;

// DTO Class
public class Motorcycle {

    // Properties
    private int id;
    private String vin;
    private String make;
    private String model;
    private String year;
    private String color;

    // Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return getId() == that.getId() &&
                Objects.equals(getVin(), that.getVin()) &&
                Objects.equals(getMake(), that.getMake()) &&
                Objects.equals(getModel(), that.getModel()) &&
                Objects.equals(getYear(), that.getYear()) &&
                Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVin(), getMake(), getModel(), getYear(), getColor());
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
