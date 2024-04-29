package com.example.shopping_cart_application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.shop.config.AppConfig;
import com.example.shop.model.Passenger;
import com.example.shop.service.PassengerService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the PassengerService bean
        PassengerService passengerService = context.getBean(PassengerService.class);

        // Example usage of PassengerService
        Passenger passenger = new Passenger();
        passenger.setName("John Doe");
        passenger.setAge(30);
        passenger.setGender("Male");

        // Save passenger
        passengerService.savePassenger(passenger);

        // Get all passengers
        System.out.println("All passengers:");
        for (Passenger p : passengerService.getAllPassengers()) {
            System.out.println(p);
        }

        context.close();
    }
}
