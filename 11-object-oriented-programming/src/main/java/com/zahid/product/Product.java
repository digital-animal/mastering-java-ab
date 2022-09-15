package com.zahid.product;

public class Product {
    private int itemNo;
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Product(int itemNo) {
        this.itemNo = itemNo;
    }

    public Product(int itemNo, String itemName) {
        this.itemNo = itemNo;
        this.itemName = itemName;
    }

    public Product(int itemNo, String itemName, double itemPrice, int itemQuantity) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemNo() {
        return itemNo;
    }  

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "Product [itemName=" + itemName + ", itemNo=" + itemNo + ", itemPrice=" + itemPrice + ", itemQuantity="
                + itemQuantity + "]";
    }

    
}
