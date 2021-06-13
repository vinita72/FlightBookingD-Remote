package com.FlightBookingSystem.FlightDetails;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.repository.FlightRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class FlightDetailsApplication implements CommandLineRunner{



	
	@Autowired
	public FlightRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(FlightDetailsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		FlightDetails f1 = new FlightDetails(1, "Pune", "Delhi", 30, 4000, "07-July-2021");
		FlightDetails f2 = new FlightDetails(5, "Pune", "Jaipur", 30, 5000, "07-July-2021");

		
		repository.save(f1);
		repository.save(f2);
		
		
		System.out.println("***");
		
		
		List<FlightDetails> flightDetails = repository.findAll();
		for (FlightDetails f : flightDetails) {
			System.out.println(f.toString());
		}


	}


	
}



/*
* // Check and book for first class seating public void
* firstClassBooking(@RequestBody FlightDetails flightDetails) { //int tempseats
* = flightDetails.getTotalseats(); boolean[] flightSeats = new boolean[30];
* 
* Scanner input = new Scanner(System.in);
* 
* for ( int cnt = 1; cnt <= 5; cnt++ ) { //check if seat is available to
* allocate to user booking. if ( flightSeats[cnt] == false ) { //book seat
* flightSeats[cnt] = true;
* System.out.printf("First Class Seat Booking: Seat# %d\n", cnt); break; } else
* if ( flightSeats[5] == true ) { if ( flightSeats[10] == true) { //if both
* classes are fully booked System.out.
* println("Apologies!! All seats are booked. Next flight is scheduled in '3' hours."
* ); }
* 
* } }}
*/
			
