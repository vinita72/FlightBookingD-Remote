package com.FlightBookingSystem.FlightPassenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.FlightBookingSystem.FlightPassenger.model.Passenger;
import com.FlightBookingSystem.FlightPassenger.repository.PassengerRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class FlightPassengerApplication implements CommandLineRunner{
	
	@Autowired
	private PassengerRepo repository;

	public static void main(String[] args) {
		SpringApplication.run(FlightPassengerApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Passenger p1 = new Passenger(1, "Rao", "lily", "rao12", "rao12@gmail.com", 81928931, 1839, "block 2", null);
		Passenger p2 = new Passenger(2, "Rjao", "lily", "rao22", "rao12@gmail.com", 81928931, 1839, "block 2", null);

		
		repository.save(p1);
		repository.save(p2);
		
		
		System.out.println("***");
		
		
		List<Passenger> passenger = repository.findAll();
		for (Passenger p : passenger) {
			System.out.println(p.toString());
		}

	}

}
