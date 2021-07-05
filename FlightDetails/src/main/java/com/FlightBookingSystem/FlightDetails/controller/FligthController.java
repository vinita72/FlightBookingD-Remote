package com.FlightBookingSystem.FlightDetails.controller;

import java.util.List;
import java.util.Optional;
import java.util.Collections;
import java.util.stream.Collectors;
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
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightDetails.exception.ResourceNotFoundException;
//import com.FlightBookingSystem.FlightDetails.common.Payment;
//import com.FlightBookingSystem.FlightDetails.common.TransactionRequest;
//import com.FlightBookingSystem.FlightDetails.common.TransactionResponse;
import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.repository.FlightRepo;
import com.FlightBookingSystem.FlightDetails.service.FlightService;

		
@RestController
@RequestMapping("/flight")
@CrossOrigin(origins = "http://localhost:4200")
public class FligthController {

		
		@Autowired
		private FlightRepo repository;
		
		@Autowired
		private FlightService service;
		
		
		
		  @GetMapping("/findAllFlightDetails")
			public List<FlightDetails> getFlightDetails(){
				return repository.findAll();
			}
			
			@GetMapping("/findAllFlightDetails/{id}")
			public Optional<FlightDetails> getFlightDetails(@PathVariable int id){
				return repository.findById(id);
			}
			
			
			
			   @GetMapping("/findAllFlightDetail/{date}")
			    public FlightDetails getFlightDetails(@PathVariable String date) {
			        return service.fetchFlightByDate(date);
			    }
			
			   
			   
			   
			   @PutMapping("/flightupdate/{id}")  
			   public ResponseEntity<FlightDetails> updateFlightDetails(@PathVariable int id, @RequestBody FlightDetails flightDetails){
				   FlightDetails flight = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("flight not exsist with id" +id));
					
				   flight.setDate(flightDetails.getDate());
				   flight.setFromlocation(flightDetails.getFromlocation());
				   flight.setTolocation(flightDetails.getTolocation());
				   flight.setTotalseats(flightDetails.getTotalseats());
				   flight.setPrice(flightDetails.getPrice());
						   
				   FlightDetails updatedFlight = repository.save(flight);
					return ResponseEntity.ok(updatedFlight);   
						   		   
			   }
						   
						   
			   
			   
				/*
				 * @PutMapping("/update") public FlightDetails updateFlight(@RequestBody
				 * FlightDetails flightDetails) { return
				 * service.updateFlightDetails(flightDetails); }
				 */
			
			@DeleteMapping("/delete/{id}")
			public String deleteFlightDetails(@PathVariable int id) {
				repository.deleteById(id);
				return "passenger deleted with id: " +id;
			}
		
			 @PostMapping("/addFlightDetails") 
			  public String RegisterFlightDetails(@RequestBody FlightDetails flightDetails) throws Exception { 
				 String tempDate = flightDetails.getDate(); 
					if(tempDate != null && !"".equals(tempDate)) 
					{
						FlightDetails flightDetailsObj = service.fetchFlightByDate(tempDate); 
					if(flightDetailsObj != null) { 
						throw new Exception("FlightDetails with "+tempDate+" is already exist");
						} } 
				 
			  FlightDetails flightDetailsObj = null; 
			 flightDetailsObj = service.saveflightDetails(flightDetails); 
			return "Flight Details on Date " +flightDetails.getDate()+" added!";
			}
			 
			 
			 

			  @PostMapping("/searchFlightDetails") 
			  public String searchFlightDetails(@RequestBody FlightDetails flightDetails) throws Exception{ 
			 String tempDate = flightDetails.getDate(); 
			String tempFromlocation = flightDetails.getFromlocation();
			String tempTolocation = flightDetails.getTolocation();
			FlightDetails flightDetailsObj = null; 
			if(tempDate != null && tempFromlocation != null && tempTolocation != null) { 
				flightDetailsObj = service.fetchFlightDetailsByDateAndFromlocationAndTolocation(tempDate, tempFromlocation, tempTolocation);
			}
			if(flightDetailsObj == null) {
				throw new Exception("Not Available");
				
			}
			return "Below Flights Are Available on" +flightDetails.getDate() +"please select!";
			  }
			 
			
			
			
			 
		
	}


	/*
	 * @GetMapping("/findAllFlightDetails/{date}") public Optional<FlightDetails>
	 * findProductByName1(@PathVariable String date) { return
	 * repository.findByDate(date); }
	 * 
	 */
	/*
	 * @GetMapping("/findAllFlightDetail/{date}") public FlightDetails
	 * findProductByName(@PathVariable String date) { return
	 * service.fetchFlightByDate(date); }
	 */
	
	/*
	 * @GetMapping("/findAllFlightDetails/{date}") public Optional<FlightDetails>
	 * getFlightDetails(@PathVariable String date){ return
	 * repository.findByDate(date); }
	 */
	
	/*
	 * @PutMapping("/update/{id}") public ResponseEntity<?>
	 * saveResource(@RequestBody Passenger passenger,
	 * 
	 * @PathVariable("id") String id) { service.savePassenger(passenger); return
	 * ResponseEntity.ok("resource saved"); }
	 */

/*
 * @GetMapping() public String hello() { String url =
 * "http://FlightPassenger/passenger/Pass"; return
 * restTemplate.getForObject(url, String.class);
 * 
 * }
 * 
 * @GetMapping("/hey") public String hey() { String url1 =
 * "http://FlightPayment/payment/doPayment"; return
 * restTemplate.getForObject(url1, String.class); }
 */


/*
 * @PostMapping("/bookFlight") public TransactionResponse
 * bookFlightDetails(@RequestBody TransactionRequest request) {
 * 
 * return service.saveFlightDetails(request); }
 * 
 *  return new FlightDetails(payment.getPaymentStatus(), payment.gettTansactionId, passenger.getFirstName());
	})
			
			.collection(Collectors.toList());
 */

//http://FlightPassenger/payment/doPayment
//   http://PassengerDetails/registerpassenger
