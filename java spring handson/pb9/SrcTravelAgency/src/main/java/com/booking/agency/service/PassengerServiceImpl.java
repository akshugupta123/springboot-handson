package com.booking.agency.service;

import java.util.List;
import com.booking.agency.Dao.PassengerDao;

import com.booking.agency.model.Passenger_Details;

public class PassengerServiceImpl implements PassengerService{
	
	
	private PassengerDao passengerDao;
	
	

	public PassengerDao getPassengerDao() {
		return passengerDao;
	}

	public void setPassengerDao(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	@Override
	public int insert(Passenger_Details passenger_Details) {
		int r =    passengerDao.insert(passenger_Details);
		return r;
	}

	@Override
	public int update(Passenger_Details passenger_Details) {
	   int r =  passengerDao.update(passenger_Details);
		return r;
	}

	@Override
	public int delete(int passenger_id) {
		  int r = passengerDao.delete(passenger_id);
		return r;
	}

	@Override
	public List<Passenger_Details> getAllPassengers() {
	List<Passenger_Details> allPassengers = passengerDao.getAllPassengers();
		return allPassengers;
	}

}
