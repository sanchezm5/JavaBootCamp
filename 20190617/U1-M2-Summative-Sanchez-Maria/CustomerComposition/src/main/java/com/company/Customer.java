/**
 * CustomerComposition:
 * In this exercise, you will design and implement a class that represents a customer based on the specification below.
 * Use composition for maximum code reuse. Design a Customer class.
 * It must keep track of:
 *      First name, Last name, Email, Phone number
 *      Shipping address: Street 1, Street 2, City, State, Zip
 *      Billing address: Street 1, Street 2, City, State, Zip
 *      If the customer is a Rewards Member or not.
 */

package com.company;

public class Customer {

    // Properties
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean isRewardsMember;

    // Other private data members
    private Address shippingAddress;
    private Address billingAddress;

    // Constructor
    public Customer() {

    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }

    // Other Class Getters and Setters
    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
