package com.example.shopping_cart_application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.shop.pojo.Battery;
import com.example.shop.pojo.Disc;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve beans from context
        Battery battery = (Battery) context.getBean("battery");
        Disc disc = (Disc) context.getBean("disc");

        // Print out the bean details
        System.out.println("Battery Details:");
        System.out.println("Product ID: " + battery.getProductId());
        System.out.println("Product Name: " + battery.getProductName());
        System.out.println("Price: $" + battery.getPrice());
        System.out.println("Rechargeable: " + battery.isRechargeable());

        System.out.println("\nDisc Details:");
        System.out.println("Product ID: " + disc.getProductId());
        System.out.println("Product Name: " + disc.getProductName());
        System.out.println("Price: $" + disc.getPrice());
        System.out.println("Capacity: " + disc.getCapacity() + " MB");
    }
}
