package com.example.Passenger10;

import java.time.LocalDate;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Pass.config.Initializer;
import com.example.Pass.dao.PassengerDAO;
import com.example.Pass.domain.Passenger;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Initializer.class);
        PassengerDAO passengerDao = context.getBean("passengerDAOImpl", PassengerDAO.class);

        System.out.println("----------------Insert Passenger Records-----------------------------------");
        Passenger passenger1 = new Passenger("John Doe", LocalDate.of(1980, 5, 15));
        Passenger passenger2 = new Passenger("Alice Smith", LocalDate.of(1990, 8, 25));

        passengerDao.save(passenger1);
        passengerDao.save(passenger2);

        System.out.println("----------------Fetch All Passenger Records-----------------------------------");
        System.out.println(passengerDao.getAll());

        System.out.println("----------------Fetch single Passenger Record-----------------------------------");
        System.out.println(passengerDao.getById(1L));

        System.out.println("----------------Delete Passenger Record-----------------------------------");
        passengerDao.delete(2L);

        context.registerShutdownHook();
        context.close();
    }
}
