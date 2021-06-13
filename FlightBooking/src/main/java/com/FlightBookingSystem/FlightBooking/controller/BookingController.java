package com.FlightBookingSystem.FlightBooking.controller;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightBooking.model.Booking;
import com.FlightBookingSystem.FlightBooking.model.FlightDetails;
import com.FlightBookingSystem.FlightBooking.model.PassAccount;
import com.FlightBookingSystem.FlightBooking.model.Passenger;
import com.FlightBookingSystem.FlightBooking.model.Payment;


@RestController
public class BookingController {

	@Autowired
	   private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String booking() {
		return "Please Login First!!";
	}
	
	
	
    @GetMapping("/{id}")
	public List<Booking>getBooking(@PathVariable("id") int id)
	{
		Passenger passenger = restTemplate.getForObject("http://FlightPassenger/passenger/findAllPassenger/" +id, Passenger.class);
		return (List<Booking>) passenger.getPassAccount().stream().map(passAccount->{
			FlightDetails flightDetails = restTemplate.getForObject("http://FlightDetails/flight/findAllFlightDetails/" +id, FlightDetails.class);
			return new Booking(passenger.getId(), passenger.getEmailId(), flightDetails.getPrice());
		})
				.collect(Collectors.toList());
	}
}
	
	
	 /* @RequestMapping("{/id}") 
	  public List<Booking>getFlight(@PathVariable("id") String id){ 
		  Passenger passenger = restTemplate.getForObject("http://FlightPassenger/passenger//findAllPassenger" +id, Passenger.class);
	  return passenger.getPassAccount().stream().map(passAccount->{
		  FlightDetails flightDetails = restTemplate.getForObject("http://FlightDetails/flight/findAllFlightDetails" +id, FlightDetails.class);
		  return new Booking(passenger.getEmailId(), passenger.getId(), flightDetails.getPrice());
	  })
			  .collect(Collectors.toList());

			  }
			  }*/
			  
			  /*return passenger.getPassAccount().stream().map(passAcconut->{
		  Payment payment = restTemplate.getForObject("http://FlightPayment/payment/doPayment", Payment.class); 
		  return new FlightDetails(); 
		  
		  //need to add all get.emailid and
	  
	  }) 
			  .collect(Collectors.toList());
	  
	  }
	*/



