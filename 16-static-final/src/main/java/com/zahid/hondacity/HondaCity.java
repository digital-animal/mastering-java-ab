package com.zahid.hondacity;

public class HondaCity {
    public static double carPrice = 100_000;
    public double regFree;
    public double taxReturn;

    public HondaCity() {
    }

    public HondaCity(double regFree, double taxReturn) {
        this.regFree = regFree;
        this.taxReturn = taxReturn;
    }

    public static double finalSellingPrice(String city) {
        
        switch (city.toUpperCase()) {
            case "DHAKA":
                return carPrice + carPrice * 0.10;
            case "COMILLA":
                return carPrice + carPrice * 0.15;
            case "CHITTAGONG":
                return carPrice + carPrice * 0.08;
            default:
                return carPrice;
        }
    }
}
