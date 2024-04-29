package com.example.shopping_cart_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.shop.pojo.Product;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.pojo.Cashier;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Customer 1
        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
        cart1.addItem(new Product("Product A", 10.0));
        cart1.addItem(new Product("Product B", 20.0));
        System.out.println("Items in Cart 1: " + cart1.getItems());

        // Customer 2
        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
        cart2.addItem(new Product("Product C", 15.0));
        System.out.println("Items in Cart 2: " + cart2.getItems());

        // Checkout for both carts
        Cashier cashier = (Cashier) context.getBean("cashier");
        try {
            cashier.checkout(cart1);
            cashier.checkout(cart2);
        } catch (IOException e) {
            System.out.println("Error during checkout: " + e.getMessage());
        }
    }
}
