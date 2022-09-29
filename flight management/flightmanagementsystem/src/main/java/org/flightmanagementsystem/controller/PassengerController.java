package org.flightmanagementsystem.controller;

import java.math.BigInteger;
import java.util.List;

import org.flightmanagementsystem.model.Passenger;
import org.flightmanagementsystem.services.PassengerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/pass")
public class PassengerController {
    private PassengerService passengerService;

	
    
    public PassengerController(PassengerService passengerService) {
		super();
		this.passengerService = passengerService;
	}


    //build to create passenger Rest API
	@PostMapping
	public ResponseEntity<Passenger> savePassenger(@RequestBody Passenger passenger){
		return new ResponseEntity<Passenger> (passengerService.savePassenger(passenger),
				HttpStatus.CREATED);
		
	}
	@GetMapping
	public List<Passenger> getAllPassenger(){
		return passengerService.getAllPassenger();
	}
	@GetMapping("{pnrNumber}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable BigInteger pnrNumber){
        return new ResponseEntity<Passenger>(passengerService.getPassengerById(pnrNumber),
                HttpStatus.OK);
	
	}
	@PutMapping("{pnrNumber}")
	public ResponseEntity<Passenger> updatePassenger(@PathVariable ("pnrNumber")BigInteger pnrNumber,
			@RequestBody Passenger passenger) {
		return new ResponseEntity<Passenger>(passengerService.updatePassenger(passenger, pnrNumber),
				HttpStatus.OK);
	}
	@DeleteMapping("{pnrNumber}")
	public ResponseEntity<String> deletePassenger(@PathVariable("pnrNumber")BigInteger pnrNumber){
    	
        passengerService.deletePassenger(pnrNumber);
    	return new ResponseEntity<String>("Passenger deleted successfully...",HttpStatus.OK);
	}
}