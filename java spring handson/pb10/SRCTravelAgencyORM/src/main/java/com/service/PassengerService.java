package com.service;

import com.model.Passenger;

import java.util.List;

public interface PassengerService {
	void savePassenger(Passenger passenger);

	void updatePassenger(Passenger passenger);

	void deletePassenger(int passengerId);

	Passenger getPassengerById(int passengerId);

	List<Passenger> getAllPassengers();
}
