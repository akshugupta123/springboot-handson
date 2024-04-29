package com.example.shop.dao;

import java.util.List;

import com.example.shop.model.Passenger;

public interface PassengerDAO {

    void save(Passenger passenger);

    List<Passenger> getAllPassengers();

    Passenger getPassengerById(int id);

    void updatePassenger(Passenger passenger);

    void deletePassenger(int id);
}
