package com.example.tripbooking.service;

import java.util.List;

import com.example.tripbooking.entities.Payment;

public interface PaymentService {
    Payment getPaymentById(int id);
    
    List<Payment> getAllPayments();
    
    Payment createPayment(Payment payment);
    
    Payment updatePayment(int id, Payment payment);
    
    void deletePayment(int id);
}