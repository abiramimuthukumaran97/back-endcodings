package com.example.tripbooking.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tripbooking.entities.FlightBooking;
import com.example.tripbooking.repository.FlightBookingRepo;
import com.example.tripbooking.service.FlightBookingService;

import java.util.List;
import java.util.Optional;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

    @Autowired
    private FlightBookingRepo flightBookingRepo;

    @Override
    public FlightBooking getFlightBookingById(Long id) {
        Optional<FlightBooking> optionalFlightBooking = flightBookingRepo.findById(id);
        return optionalFlightBooking.orElse(null);
    }

    @Override
    public List<FlightBooking> getAllFlightBookings() {
        return flightBookingRepo.findAll();
    }

    @Override
    public FlightBooking createFlightBooking(FlightBooking flightBooking) {
        return flightBookingRepo.save(flightBooking);
    }

    @Override
    public FlightBooking updateFlightBooking(int id, FlightBooking updatedFlightBooking) {
        if (flightBookingRepo.existsById(id)) {
            updatedFlightBooking.setId(id);
            return flightBookingRepo.save(updatedFlightBooking);
        } else {
            return null; // Handle not found scenario
        }
    }

    @Override
    public void deleteFlightBooking(Long id) {
        flightBookingRepo.deleteById(id);
    }

	@Override
	public FlightBooking createFlightBooking(FlightBooking flightBooking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlightBooking updateFlightBooking(Long id, FlightBooking updatedFlightBooking) {
		// TODO Auto-generated method stub
		return null;
	}
}