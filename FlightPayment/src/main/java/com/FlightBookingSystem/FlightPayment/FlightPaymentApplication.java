package com.FlightBookingSystem.FlightPayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightPaymentApplication.class, args);
	}

}
