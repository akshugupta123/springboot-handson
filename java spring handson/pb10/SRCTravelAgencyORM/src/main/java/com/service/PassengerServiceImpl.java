package com.service;

import com.dao.PassengerDao;
import com.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	@Override
	@Transactional
	public void savePassenger(Passenger passenger) {
		passengerDao.savePassenger(passenger);
	}

	@Override
	@Transactional
	public void updatePassenger(Passenger passenger) {
		passengerDao.updatePassenger(passenger);
	}

	@Override
	@Transactional
	public void deletePassenger(int passengerId) {
		passengerDao.deletePassenger(passengerId);
	}

	@Override
	public Passenger getPassengerById(int passengerId) {
		return passengerDao.getPassengerById(passengerId);
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerDao.getAllPassengers();
	}
}
