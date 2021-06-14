package com.FlightBookingSystem.FlightPassenger.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	import com.FlightBookingSystem.FlightPassenger.model.Passenger;
	import com.FlightBookingSystem.FlightPassenger.repository.PassengerRepo;
	import com.FlightBookingSystem.FlightPassenger.service.PassengerService;

	@RestController
	@RequestMapping("/passenger")
	@CrossOrigin(origins = "http://localhost:4200")
	public class PassengerController {


		// @RequestMapping("/Pass")
		
		@Autowired
		 private PassengerRepo repository;
		
		
		
		  @Autowired 
		  private PassengerService service;  
		  
		  
		  @GetMapping("/findAllPassenger")
			 public List<Passenger> findAllPassenger(){
				  return service.getPassenger();		
				  }
			  
		  
		
			@GetMapping("/findAllPassenger/{id}")
			public Optional<Passenger> getPassenger(@PathVariable int id){
				return service.getPassengerById(id);
			}
			
			
			@PutMapping("/update/{id}")
			public ResponseEntity<?> saveResource(@RequestBody Passenger passenger,
					@PathVariable("id") String id) {
				service.savePassenger(passenger);
			    return ResponseEntity.ok("resource saved");
			}
			
		
			
			
			// fallback method
			
			/*
			 * @RequestMapping("/PassengerFall") public String readingList(){ return
			 * "Please wait"; }
			 */
		  @PostMapping("/registerpassenger") 
		  public String RegisterPassenger(@RequestBody Passenger passenger) throws Exception { 
		String tempEmail = passenger.getEmailId(); 
		if(tempEmail != null && !"".equals(tempEmail)) 
		{ Passenger passengerObj = service.fetchPassengerByEmailId(tempEmail); 
		if(passengerObj != null) { 
			throw new Exception("Passenger with "+tempEmail+" is already exist");
			} } 
		Passenger passengerObj = null; 
		passengerObj = service.savePassenger(passenger); 
		return "Hi " + passenger.getFirstName()+" your Registration process successfully completed"; 
		}
		  
		  @PostMapping("/loginhere") 
		  public String loginPassenger(@RequestBody Passenger passenger) throws Exception{ 
		String tempEmail = passenger.getEmailId(); 
		String tempPass = passenger.getPassword();
		Passenger passengerObj = null; 
		if(tempEmail != null && tempPass!= null) { 
			passengerObj = service.fetchPassengerByEmailIdAndPassword(tempEmail, tempPass);
			}
		  if(passengerObj == null) { 
			  throw new Exception("Bad Credential"); 
			  }
		  return "Welcome"; 
		  }
		  
	}
		 
		
//		 @GetMapping("/user")
//		    public String user() {
//		        return ("<h1>Welcome User</h1>");
//		    }
//	
//		 @GetMapping("/")
//		    public String home() {
//		        return ("<h1>Welcome</h1>");
//		    }
//		@GetMapping("/findAllPassenger")
//		public List<Passenger> getPassenger(){
//			return repository.findAll();
//		}
//		
//		@GetMapping("/findAllPassenger/{id}")
//		public Optional<Passenger> getPassenger(@PathVariable int id){
//			return repository.findById(id);
//		}
//		
//		@DeleteMapping("/delete/{id}")
//		public String deletePassenger(@PathVariable int id) {
//			repository.deleteById(id);
//			return "passenger deleted with id: " +id;
//		}
		
	
		/*
		 * public String Pass() { return "Hello Pass"; }
		 * 
		 */


