package com.FlightBookingSystem.FlightAdmin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightAdmin.model.Passenger;
import com.FlightBookingSystem.FlightAdmin.repository.PassengerRepo;
import com.FlightBookingSystem.FlightAdmin.service.PassengerService;


@RestController
@CrossOrigin(origins = "*")
public class SecurityController {
	
	@Autowired
	   private RestTemplate restTemplate;
	
	  @Autowired 
	  private PassengerService service;  
	  
	  @Autowired
		 private PassengerRepo repository;
		
	  
	  
	  @GetMapping("/")
		public String login(){
			return "authenticated successfully" ;
		}
	  @GetMapping("/findAllPassengers")
	 public List<Passenger> findAllPassenger(){
		  return service.getPassenger();		
		  }
	  
			/*
			 * @DeleteMapping("/delete/{id}") public String deletePassenger(@PathVariable
			 * int id) { repository.deleteById(id); return "passenger deleted with id: "
			 * +id; }
			 */

	  
}
