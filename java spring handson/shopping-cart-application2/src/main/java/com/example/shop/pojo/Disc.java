package com.example.shop.pojo;

public class Disc extends Product {
    private int capacity;

    // Parameterized constructor
    public Disc(int productId, String productName, double price, int capacity) {
        super(productId, productName, price);
        this.capacity = capacity;
    }

    // Getter and setter for capacity
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
