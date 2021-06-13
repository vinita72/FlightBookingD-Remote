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

	public static void main(String[] args) throws InterruptedException {
	      ConfigurableApplicationContext ctx = 
		SpringApplication.run(ApiGatwayApplication.class, args);
	      ServiceGate myService = ctx.getBean(ServiceGate.class);
	      int n = 5;
	      for (int i = 0; i < n; i++) {
	          myService.doSomething(i < 3 ? 0 : 2);
	          TimeUnit.MILLISECONDS.sleep(200);
	      }
	      TimeUnit.SECONDS.sleep(2);
	      System.out.println("-- final call --");
	      myService.doSomething(2);
		
	}

}
