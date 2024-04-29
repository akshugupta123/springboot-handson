// PassengerDAOImpl.java
package com.example.shop.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.shop.model.Passenger;

@Repository
public class PassengerDAOImpl implements PassengerDAO {

    // In-memory database simulation
    private Map<Integer, Passenger> passengers = new HashMap<>();
    private int nextId = 1;

    @Override
    public void save(Passenger passenger) {
        if (passenger.getId() == 0) {
            passenger.setId(nextId++);
        }
        passengers.put(passenger.getId(), passenger);
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return new ArrayList<>(passengers.values());
    }

    @Override
    public Passenger getPassengerById(int id) {
        return passengers.get(id);
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        passengers.put(passenger.getId(), passenger);
    }

    @Override
    public void deletePassenger(int id) {
        passengers.remove(id);
    }
}
