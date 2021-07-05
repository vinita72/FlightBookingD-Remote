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
		
		
	}
}
