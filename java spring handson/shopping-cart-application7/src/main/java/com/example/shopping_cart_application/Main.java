package com.example.shopping_cart_application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.shop.pojo.Product;
import com.example.shop.pojo.ShoppingCart;
import com.example.shop.service.Cashier;

@Configuration
@ComponentScan("com.example")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        // Customer 1
        ShoppingCart cart1 = context.getBean(ShoppingCart.class);
        cart1.addItem(new Product("Product A", 10.0));
        cart1.addItem(new Product("Product B", 20.0));
        System.out.println("Items in Cart 1: " + cart1.getItems());

        // Customer 2
        ShoppingCart cart2 = context.getBean(ShoppingCart.class);
        cart2.addItem(new Product("Product C", 15.0));
        System.out.println("Items in Cart 2: " + cart2.getItems());

        Cashier cashier = context.getBean(Cashier.class);
        cashier.openFile();
        cashier.checkout(cart1);
        cashier.checkout(cart2);
        cashier.closeFile();

        context.close();
    }
}
