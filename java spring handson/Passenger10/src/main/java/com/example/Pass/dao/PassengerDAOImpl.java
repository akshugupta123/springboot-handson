package com.example.Pass.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.Pass.domain.Passenger;

import java.util.List;

@Transactional
public class PassengerDAOImpl implements PassengerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Passenger passenger) {
        entityManager.persist(passenger);
    }

    public void update(Passenger passenger) {
        entityManager.merge(passenger);
    }

    public void delete(Long id) {
        Passenger passenger = getById(id);
        if (passenger != null) {
            entityManager.remove(passenger);
        }
    }

    public Passenger getById(Long id) {
        return entityManager.find(Passenger.class, id);
    }

    public List<Passenger> getAll() {
        return entityManager.createQuery("SELECT p FROM Passenger p", Passenger.class).getResultList();
    }
}
