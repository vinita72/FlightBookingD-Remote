package com.FlightBookingSystem.FlightPassenger.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	
	 @GetMapping("/admin")
	    public String admin() {
	        return ("<h1>Welcome Admin</h1>");
	    }
}
