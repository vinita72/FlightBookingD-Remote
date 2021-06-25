package com.FlightBookingSystem.FlightPayment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlightBookingSystem.FlightPayment.model.PaytmDetailsPojo;
import com.FlightBookingSystem.FlightPayment.repository.PaymentRepo;

@Service
public class PaymentService {

	/*
	 * @Autowired private PaymentRepo repository;
	 * 
	 * public Payment doPayment(Payment payment) {
	 * payment.setPaymentStatus(paymentProcessing());
	 * payment.setTransactionId(UUID.randomUUID().toString()); return
	 * repository.save(payment); }
	 * 
	 * public String paymentProcessing() { // third party api call paypal or
	 * paytim...
	 * 
	 * 
	 * return new Random().nextBoolean()?"success":"False"; }
	 */
}
