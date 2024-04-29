package com.example.Pass.dao;

import java.util.List;

import com.example.Pass.domain.Passenger;

public interface PassengerDAO {
    void save(Passenger passenger);
    void update(Passenger passenger);
    void delete(Long id);
    Passenger getById(Long id);
    List<Passenger> getAll();
}
