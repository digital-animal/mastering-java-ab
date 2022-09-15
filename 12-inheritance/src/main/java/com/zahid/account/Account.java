package com.zahid.account;

public class Account {
    private int accountNo;
    private String name;
    private String address;
    private String phoneNumber;
    private String dateOfBirth;
    private double balance;

    public Account(int accountNo, String name, String address, String phoneNumber, String dateOfBirth) {
            this.accountNo = accountNo;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNo() {
    return accountNo;
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

    public String getDateOfBirth() {
    return dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void closeAccount() {
        System.out.println("Account Closed");
    }

    @Override
    public String toString() {
    return "Account [accountNo=" + accountNo + ", address=" + address + ", dateOfBirth=" + dateOfBirth
    + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

}
