package org.flightmanagementsystem.services;

import java.math.BigInteger;
import java.util.List;

import org.flightmanagementsystem.model.Passenger;



public interface PassengerService {
	//save
		Passenger savePassenger( Passenger passenger);
		//findall
		List<Passenger> getAllPassenger();
		//find
		Passenger getPassengerById(BigInteger pnrNumber);
		//update
		Passenger updatePassenger(Passenger passenger ,BigInteger pnrNumber);
		//delete
		void deletePassenger(BigInteger pnrNumber);
	
}