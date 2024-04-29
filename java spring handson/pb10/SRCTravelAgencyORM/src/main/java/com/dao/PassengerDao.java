package com.dao;

import com.model.Passenger;

import java.util.List;

public interface PassengerDao {
	void savePassenger(Passenger passenger);

	void updatePassenger(Passenger passenger);

	void deletePassenger(int passengerId);

	Passenger getPassengerById(int passengerId);

	List<Passenger> getAllPassengers();
}
