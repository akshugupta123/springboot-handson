package com.booking.agency.Dao;

import java.util.List;

import com.booking.agency.model.Passenger_Details;

public interface PassengerDao {

	public int insert(Passenger_Details passenger_Details);
	
	public int update(Passenger_Details passenger_Details);
	
	public int delete(int passenger_id);
	
	public List<Passenger_Details> getAllPassengers();
	
}
