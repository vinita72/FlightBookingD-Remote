package com.FlightBookingSystem.FlightBooking.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class BookingConfig extends WebSecurityConfigurerAdapter{

	
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception {
		  http.cors();
			  http 
			  .antMatcher("/**").authorizeRequests() 
			  .antMatchers(new String[]{"/"}).permitAll()
			  .anyRequest()
			  .authenticated() .and()
			  .oauth2Login();
			  }
}
