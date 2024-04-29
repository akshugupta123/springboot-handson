package com.example.shop.pojo;

public class Disc extends Product {
    private int capacity; // Additional property for the disc's capacity

    // Default constructor
    public Disc() {
        super(5, "sics", 10.0, 40.0); // Call the superclass constructor with default values for product properties
        this.capacity = 0; // Initialize capacity to default value
    }

    // Parameterized constructor
    public Disc(int productId, String productName, double price, double discount, int capacity) {
        super(productId, productName, price, discount); // Call the superclass constructor to initialize product properties
        this.capacity = capacity; // Set the capacity property
    }

    // Getters and setters for the capacity property
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
