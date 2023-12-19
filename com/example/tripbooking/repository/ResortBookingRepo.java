package com.example.tripbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tripbooking.entities.ResortBooking;

public interface ResortBookingRepo extends JpaRepository<ResortBooking, String> {
    // You can add custom query methods if needed
    // For example:
    // ResortBooking findByName(String name);
    // ResortBooking findByEmailId(String emailId);
    // List<ResortBooking> findByRoomType(String roomType);
    // ...

    // Spring Data JPA provides basic CRUD operations out of the box
}