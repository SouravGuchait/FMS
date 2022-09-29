package org.flightmanagementsystem.model;

import java.util.List;

import javax.persistence.CascadeType;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Booking {
	public Booking(Flight flight) {
		super();
		this.flight = flight;
	}

	public Booking(List<Passenger> passengerList) {
		super();
		this.passengerList = passengerList;
	}

	public Booking(User userId) {
		super();
		this.userId = userId;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingId;
	
	@Column(name="bookingdate")
	private String bookingdate;
	
	@Column(name="ticketCost")
	private Double ticketCost;
	
	@Column(name="NoOfPassenger")
	private int noOfPassenger;
	
	@OneToOne(cascade= CascadeType.ALL)
	private User userId;
	
	@OneToOne(targetEntity = Passenger.class,cascade=CascadeType.ALL)
	@JoinColumn(name= "passListBooking_fk",referencedColumnName="id")
	private List<Passenger> passengerList;
	
	private Flight flight;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}