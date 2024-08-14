package com.java.solid.SingleResponsibility;

public class Sale {
    private String productName;
    private int quantity;
    private double price;

    public Sale(String productName, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
