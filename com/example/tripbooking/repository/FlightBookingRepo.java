package com.example.tripbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tripbooking.entities.FlightBooking;

@Repository
public interface FlightBookingRepo extends JpaRepository<FlightBooking, String> {
    // You can add custom query methods here if needed
}