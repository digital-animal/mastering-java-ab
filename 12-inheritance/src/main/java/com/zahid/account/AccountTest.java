package com.zahid.account;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(101, "Zahidul Islam", "Badda, Dhaka", "2441139", "24091992");
        acc.deposit(5000.0);
        acc.withdraw(3000.0);
        System.out.println(acc.getBalance());
    }
}
