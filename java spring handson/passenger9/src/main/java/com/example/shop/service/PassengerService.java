package com.example.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.dao.PassengerDAO;
import com.example.shop.model.Passenger;

@Service
public class PassengerService {

    @Autowired
    private PassengerDAO passengerDAO;

    public void savePassenger(Passenger passenger) {
        passengerDAO.save(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengerDAO.getAllPassengers();
    }

    public Passenger getPassengerById(int id) {
        return passengerDAO.getPassengerById(id);
    }

    public void updatePassenger(Passenger passenger) {
        passengerDAO.updatePassenger(passenger);
    }

    public void deletePassenger(int id) {
        passengerDAO.deletePassenger(id);
    }
}
