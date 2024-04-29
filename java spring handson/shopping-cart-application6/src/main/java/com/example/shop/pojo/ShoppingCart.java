package com.example.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }

    // Setter method for the 'items' property
    public void setItems(List<Product> items) {
        this.items = items;
    }
}
