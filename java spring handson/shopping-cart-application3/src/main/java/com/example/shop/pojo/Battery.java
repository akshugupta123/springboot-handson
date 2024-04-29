package com.example.shop.pojo;

public class Battery extends Product {
    private boolean rechargeable;

    // Default constructor
    public Battery() {
        super(2, "xyz", 15.0, 20.0); // Call the superclass constructor with default values
    }

    // Parameterized constructor
    public Battery(int productId, String productName, double price, double discount, boolean rechargeable) {
        super(productId, productName, price, discount);
        this.rechargeable = rechargeable;
    }

    // Getters and setters for the rechargeable property...
    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
