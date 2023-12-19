package com.example.tripbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tripbooking.entities.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    // You can add custom query methods here if needed
}