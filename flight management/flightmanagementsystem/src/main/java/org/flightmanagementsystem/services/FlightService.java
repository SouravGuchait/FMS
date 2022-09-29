package org.flightmanagementsystem.services;

import java.util.List;

import org.flightmanagementsystem.model.Flight;

public interface FlightService {
	Flight saveFlight(Flight flight);
	
	Flight getFlightById(long flightId);
	
	List<Flight> getAllFlight();
	
	Flight updateFlight(Flight flight, long flightId);
	
	void deleteFlight(long flightId);
	

}
