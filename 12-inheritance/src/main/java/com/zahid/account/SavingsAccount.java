package com.zahid.account;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String name, String address, String phoneNumber, String dateOfBirth) {
        super(accountNo, name, address, phoneNumber, dateOfBirth);
    }
    
    public void deposit(double amount) {
        double accountBalance = super.getBalance();
        
        if(accountBalance + amount >=0) {
            accountBalance = accountBalance + amount;
            super.setBalance(accountBalance);
        }
        return;
    }
       
    public void withdraw(double amount) {
        double accountBalance = super.getBalance();
        
        if(accountBalance - amount >=0) {
            accountBalance = accountBalance - amount;
            super.setBalance(accountBalance);
        }
        return;
    }
}
