package com.zahid.product;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product(1001, "Tooth Brush", 80.0, 20);
        
        System.out.println(p1);
        System.out.println(p1.getItemNo());
        System.out.println(p1.getItemName());
        System.out.println(p1.getItemPrice());
        System.out.println(p1.getItemQuantity());
        System.out.println();
       
        Product p2 = new Product(1002, "Pen", 15.0, 50);
        
        System.out.println(p2);
        System.out.println(p2.getItemNo());
        System.out.println(p2.getItemName());
        System.out.println(p2.getItemPrice());
        System.out.println(p2.getItemQuantity());
        System.out.println();
    }
}
