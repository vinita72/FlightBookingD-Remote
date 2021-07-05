package com.FlightBookingSystem.ApiGatway;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;

import com.FlightBookingSystem.ApiGatway.service.ServiceGate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableZuulProxy
@EnableCircuitBreaker
@EnableSwagger2 
public class ApiGatwayApplication {

	public static void main(String[] args)  {
		SpringApplication.run(ApiGatwayApplication.class, args);
	   
		
	}

}
