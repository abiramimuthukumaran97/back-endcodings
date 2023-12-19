package com.example.tripbooking.serviceimpl;

import com.example.tripbooking.service.ResortBookingService;

public class ResortBookingServiceImpl implements ResortBookingService {

    @Override
    public void processBooking(String name, String emailId, String roomType, String checkIn, String checkOut) {
        // Business logic for processing the booking
        // This could include validation, saving to a database, sending notifications, etc.

        // For now, just print the data to the console
        System.out.println("Booking Details - Name: " + name + ", Email: " + emailId +
                ", Room Type: " + roomType + ", Check-in: " + checkIn + ", Check-out: " + checkOut);
    }
}
