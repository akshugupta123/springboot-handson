package com.example.Passenger12.controller;

//package com.mphasis.storeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.Passenger12.domain.Passenger;



@Controller
public class PassengerController {

    @GetMapping("/passengerform")
    public String showPassengerForm(@ModelAttribute("passenger") Passenger passenger) {
        return "passengerform";
    }

    @PostMapping("/savepassenger")
    public ModelAndView savePassenger(@ModelAttribute("passenger") Passenger passenger) {
        // Logic to save the passenger details in the database
        // You can use a service class to perform the database operations

        // For demonstration purpose, we'll just return a success message
        ModelAndView modelAndView = new ModelAndView("passengerdetails");
        modelAndView.addObject("passenger", passenger);
        return modelAndView;
    }

    @GetMapping("/passengerdetails")
    public ModelAndView showPassengerDetails() {
        // Logic to fetch and display passenger details from the database
        // You can use a service class to retrieve the passenger details

        // For demonstration purpose, we'll create a dummy passenger object
        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setName("John Doe");
        // Set other attributes as needed

        ModelAndView modelAndView = new ModelAndView("passengerdetails");
        modelAndView.addObject("passenger", passenger);
        return modelAndView;
    }
}
