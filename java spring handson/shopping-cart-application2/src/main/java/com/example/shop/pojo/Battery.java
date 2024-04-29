package com.example.shop.pojo;

public class Battery extends Product {
    private boolean rechargeable;

    // Parameterized constructor
    public Battery(int productId, String productName, double price, boolean rechargeable) {
        super(productId, productName, price);
        this.rechargeable = rechargeable;
    }

    // Getter and setter for rechargeable
    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
