package com.FlightBookingSystem.FlightDetails.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.FlightBookingSystem.FlightDetails.model.FlightDetails;

@Repository
public interface FlightRepo extends MongoRepository<FlightDetails, Integer>  {

	public FlightDetails findByDate(String date);

	public FlightDetails findByDateAndFromlocationAndTolocation(String date, String fromlocation, String tolocation); 

}

