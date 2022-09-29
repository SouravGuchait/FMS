package org.flightmanagementsystem.dao;

import org.flightmanagementsystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightDao extends JpaRepository<Flight, Long>{

}