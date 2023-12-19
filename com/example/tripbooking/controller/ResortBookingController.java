package com.example.tripbooking.controller;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResortBookingController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Welcome to Resort Booking");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get parameters from the request
        String name = request.getParameter("name");
        String emailId = request.getParameter("emailId");
        String roomType = request.getParameter("roomType");
        String checkIn = request.getParameter("checkIn");
        String checkOut = request.getParameter("checkOut");

        // Process the data (you can add your business logic here)

        // For now, just print the data to the console
        System.out.println("Booking Details - Name: " + name + ", Email: " + emailId +
                ", Room Type: " + roomType + ", Check-in: " + checkIn + ", Check-out: " + checkOut);

        // Redirect to a confirmation page or show a response
        response.getWriter().println("Booking Successful! Thank you!");
    }
}
