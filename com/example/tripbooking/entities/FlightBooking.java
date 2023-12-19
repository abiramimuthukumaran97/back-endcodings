package com.example.tripbooking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FlightBooking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String fromPlace;
	@Column(length=20)
	private String toPlace;
	@Column(length=30)
	private String departureDate;
	private String passengers;
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	@Override
	public String toString() {
		return "FlightBooking [fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", departureDate=" + departureDate
				+ ", passengers=" + passengers + "]";
	}
}