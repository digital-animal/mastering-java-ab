package com.zahid.customer;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Zahidul Islam");
        Customer c2 = new Customer(1002, "Tonmoy Hasan");
        Customer c3 = new Customer(1003, "Zahid Alam", "Mirpur, Dhaka", "816049");

        c1.setAddress("Badda, Dhaka");
        c1.setPhoneNumber("112489");
        c2.setAddress("Merul, Dhaka");
        c2.setPhoneNumber("492357");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
