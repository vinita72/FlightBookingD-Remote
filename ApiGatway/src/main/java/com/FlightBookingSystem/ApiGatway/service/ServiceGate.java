package com.FlightBookingSystem.ApiGatway.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
@DefaultProperties
public class ServiceGate {

	 @HystrixCommand(fallbackMethod = "defaultDoSomething", commandKey = "doSomethingKey")
	  public void doSomething(int input) {
	      System.out.println("output: " + 10 / input);
	  }

	  public void defaultDoSomething(int input, Throwable throwable) {
	      System.out.printf("fallback, input:%s, exception:%s%n", input, throwable);
	  }
	
	/*
	 * @RequestMapping("/PassengerFall") public String readingList(){ return
	 * "Please wait"; }
	 */
	  
}
