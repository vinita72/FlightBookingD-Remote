package com.FlightBookingSystem.FlightPayment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingSystem.FlightPayment.model.PaytmDetailsPojo;


public interface PaymentRepo extends MongoRepository<PaytmDetailsPojo, Integer> {

}
