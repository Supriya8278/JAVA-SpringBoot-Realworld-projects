 package com.project.flightcheckin.integration.dto;


public class Reservation {


	private Boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	

	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [ checkedIn=" + checkedIn + ", numberOfBags=" + numberOfBags + ", passenger="
				+ passenger + ", flight=" + flight + "]";
	}
	
	
	
	
}
