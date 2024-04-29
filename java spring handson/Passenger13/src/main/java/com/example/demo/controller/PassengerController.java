package com.example.demo.controller;

import com.example.demo.model.Passenger;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    private final Map<Long, Passenger> passengers = new HashMap<>();
    private long nextId = 1;

    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        passenger.setId(nextId++);
        passengers.put(passenger.getId(), passenger);
        return passenger;
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return new ArrayList<>(passengers.values());
    }

    @GetMapping("/{passengerId}")
    public Passenger getPassenger(@PathVariable Long passengerId) {
        return passengers.get(passengerId);
    }

    @PutMapping("/{passengerId}")
    public Passenger updatePassenger(@PathVariable Long passengerId, @RequestBody Passenger updatedPassenger) {
        Passenger passenger = passengers.get(passengerId);
        if (passenger != null) {
            passenger.setName(updatedPassenger.getName());
            // Update other fields as needed
        }
        return passenger;
    }

    @DeleteMapping("/{passengerId}")
    public void deletePassenger(@PathVariable Long passengerId) {
        passengers.remove(passengerId);
    }
}
