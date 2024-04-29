package com.example.shopping_cart_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.shop.pojo.Battery;
import com.example.shop.pojo.Disc;

public class Main {
    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the battery and disc beans from the context
        Battery battery = context.getBean("battery", Battery.class);
        Disc disc = context.getBean("disc", Disc.class);

        // Print out the details of the battery and disc
        System.out.println("Battery Details:");
        System.out.println("Product ID: " + battery.getProductId());
        System.out.println("Product Name: " + battery.getProductName());
        System.out.println("Price: $" + battery.getPrice());
        System.out.println("Discount: " + battery.getDiscount());

        System.out.println("\nDisc Details:");
        System.out.println("Product ID: " + disc.getProductId());
        System.out.println("Product Name: " + disc.getProductName());
        System.out.println("Price: $" + disc.getPrice());
        System.out.println("Discount: " + disc.getDiscount());
    }
}
