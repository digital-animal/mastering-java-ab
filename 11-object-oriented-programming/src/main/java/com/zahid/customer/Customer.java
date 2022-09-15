package com.zahid.customer;

public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String phoneNumber;
    
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }
    
    public Customer(int customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [address=" + address + ", customerID=" + customerID + ", name=" + name + ", phoneNumber="
                + phoneNumber + "]";
    }

    
}
