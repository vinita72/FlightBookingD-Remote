package com.FlightBookingSystem.FlightAdmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightAdmin.model.Passenger;
import com.FlightBookingSystem.FlightAdmin.repository.PassengerRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableWebSecurity
@EnableEurekaClient
@EnableSwagger2
public class FlightAdminApplication {
	@Autowired
	private PassengerRepo repository;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FlightAdminApplication.class, args);
	}
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Passenger p1 = new Passenger(1, "Rao", "lily", "rao12", "rao12@gmail.com", 81928931, 1839, "block 2");
		Passenger p2 = new Passenger(2, "Rjao", "lily", "rao22", "rao12@gmail.com", 81928931, 1839, "block 2");

		
		repository.save(p1);
		repository.save(p2);
		
		
		System.out.println("***");
		
		
		List<Passenger> passenger = repository.findAll();
		for (Passenger p : passenger) {
			System.out.println(p.toString());
		}

	}
}
