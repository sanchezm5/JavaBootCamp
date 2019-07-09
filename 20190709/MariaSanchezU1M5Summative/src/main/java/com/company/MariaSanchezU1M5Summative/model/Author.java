package com.company.MariaSanchezU1M5Summative.model;

import java.util.Objects;

public class Author {
    // Properties
    private int id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String phone;
    private String email;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getId() == author.getId() &&
                Objects.equals(getFirstName(), author.getFirstName()) &&
                Objects.equals(getLastName(), author.getLastName()) &&
                Objects.equals(getStreet(), author.getStreet()) &&
                Objects.equals(getCity(), author.getCity()) &&
                Objects.equals(getState(), author.getState()) &&
                Objects.equals(getPostalCode(), author.getPostalCode()) &&
                Objects.equals(getPhone(), author.getPhone()) &&
                Objects.equals(getEmail(), author.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getStreet(), getCity(), getStreet(), getPostalCode(), getPhone(), getEmail());
    }
}
