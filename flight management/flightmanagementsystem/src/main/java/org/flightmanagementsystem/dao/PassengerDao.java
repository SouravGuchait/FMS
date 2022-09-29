package org.flightmanagementsystem.dao;

import java.math.BigInteger;

import org.flightmanagementsystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface PassengerDao extends JpaRepository<Passenger,BigInteger> {

}