package com.example.tripbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tripbooking.entities.FlightBooking;
import com.example.tripbooking.service.FlightBookingService;

@RestController
@RequestMapping("/api/flightbookings")
public class FlightBookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @GetMapping("/{id}")
    public ResponseEntity<FlightBooking> getFlightBookingById(@PathVariable Long id) {
        FlightBooking flightBooking = flightBookingService.getFlightBookingById(id);
        if (flightBooking != null) {
            return ResponseEntity.ok(flightBooking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<FlightBooking>> getAllFlightBookings() {
        List<FlightBooking> flightBookings = flightBookingService.getAllFlightBookings();
        return ResponseEntity.ok(flightBookings);
    }

    @PostMapping
    public ResponseEntity<FlightBooking> createFlightBooking(@RequestBody FlightBooking flightBooking) {
        FlightBooking createdFlightBooking = flightBookingService.createFlightBooking(flightBooking);
        return ResponseEntity.ok(createdFlightBooking);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FlightBooking> updateFlightBooking(@PathVariable Long id,
                                                            @RequestBody FlightBooking updatedFlightBooking) {
        FlightBooking flightBooking = flightBookingService.updateFlightBooking(id, updatedFlightBooking);
        if (flightBooking != null) {
            return ResponseEntity.ok(flightBooking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlightBooking(@PathVariable Long id) {
        flightBookingService.deleteFlightBooking(id);
        return ResponseEntity.noContent().build();
    }
}