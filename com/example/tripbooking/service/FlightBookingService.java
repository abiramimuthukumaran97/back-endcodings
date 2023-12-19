package com.example.tripbooking.service;

import java.util.List;

import com.example.tripbooking.entities.FlightBooking;

public interface FlightBookingService {
    FlightBooking getFlightBookingById(Long id);

    List<FlightBooking> getAllFlightBookings();

    FlightBooking createFlightBooking(FlightBooking flightBooking);

    FlightBooking updateFlightBooking(Long id, FlightBooking updatedFlightBooking);

    void deleteFlightBooking(Long id);
}