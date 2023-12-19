package com.example.tripbooking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ResortBooking {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String name;
	@Column(length=20)
	private String emailId;
	@Column(length=30)
	private String roomType;
	private String checkIn;
	private String checkOut;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "ResortBooking [name=" + name + ", emailId=" + emailId + ", roomType=" + roomType + ", checkIn="
				+ checkIn + ", checkOut=" + checkOut + "]";
	}
	
}