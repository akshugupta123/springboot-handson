package com.dao;

import com.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public void savePassenger(Passenger passenger) {
		hibernateTemplate.save(passenger);
	}

	@Override
	@Transactional
	public void updatePassenger(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void deletePassenger(int passengerId) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, passengerId);
		if (passenger != null) {
			hibernateTemplate.delete(passenger);
		}
	}

	@Override
	public Passenger getPassengerById(int passengerId) {
		return hibernateTemplate.get(Passenger.class, passengerId);
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return hibernateTemplate.loadAll(Passenger.class);
	}
}
