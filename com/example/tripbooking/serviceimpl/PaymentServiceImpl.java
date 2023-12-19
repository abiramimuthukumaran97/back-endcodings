package com.example.tripbooking.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tripbooking.entities.Payment;
import com.example.tripbooking.repository.PaymentRepo;
import com.example.tripbooking.service.PaymentService;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public Payment getPaymentById(int id) {
        Optional<Payment> optionalPayment = paymentRepo.findById(id);
        return optionalPayment.orElse(null);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepo.save(payment);
    }

    @Override
    public Payment updatePayment(int id, Payment updatedPayment) {
        if (paymentRepo.existsById(id)) {
            updatedPayment.setId(id);
            return paymentRepo.save(updatedPayment);
        } else {
            return null; // Handle not found scenario
        }
    }

    @Override
    public void deletePayment(int id) {
        paymentRepo.deleteById(id);
    }

	@Override
	public Payment createPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePayment(int id, Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}
}