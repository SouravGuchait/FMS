package org.flightmanagementsystem.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passenger")
public class Passenger {
	//data members/variable/field/data
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long pnrNumber ;

	private int passengerAge;
	private long passengerUIN;
	@Column(name="passengerName")

	private String passengerName;
	private Double Luggage;
	public Passenger(long pnrNumber, int passengerAge, long passengerUIN, String passengerName, Double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.passengerName = passengerName;
		Luggage = luggage;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public long getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Double getLuggage() {
		return Luggage;
	}
	public void setLuggage(Double luggage) {
		Luggage = luggage;
	}

}


