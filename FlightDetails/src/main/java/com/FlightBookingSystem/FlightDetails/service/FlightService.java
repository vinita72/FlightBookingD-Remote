package com.FlightBookingSystem.FlightDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import com.FlightBookingSystem.FlightDetails.common.EmailRequest;
//import com.FlightBookingSystem.FlightDetails.common.Passenger;
//import com.FlightBookingSystem.FlightDetails.common.Payment;
//import com.FlightBookingSystem.FlightDetails.common.TransactionRequest;
//import com.FlightBookingSystem.FlightDetails.common.TransactionResponse;
import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.repository.FlightRepo;

@Service
public class FlightService {

	@Autowired
	private FlightRepo repository;
	
	public FlightDetails saveflightDetails(FlightDetails flightDetails) {
		return repository.save(flightDetails);
	}
	
	public FlightDetails fetchFlightByDate(String date) {
		return repository.findByDate(date);
	}
	
	
	  public FlightDetails fetchFlightDetailsByDateAndFromlocationAndTolocation(String date, String fromlocation, String tolocation)
	  {
		  return repository.findByDateAndFromlocationAndTolocation(date, fromlocation, tolocation);
		  }

	public FlightDetails fetchFlightDetailsByDate(String date) {
		// TODO Auto-generated method stub
		  return repository.findByDate(date);
	}
	
	 public FlightDetails updateFlightDetails(FlightDetails flightDetails) {
		 FlightDetails existingFlightDetails = repository.findById(flightDetails.getId()).orElse(null);
	        existingFlightDetails.setFromlocation(flightDetails.getFromlocation());
	        existingFlightDetails.setTolocation(flightDetails.getTolocation());
	        existingFlightDetails.setTotalseats(flightDetails.getTotalseats());
	        existingFlightDetails.setPrice(flightDetails.getPrice());
	        existingFlightDetails.setDate(flightDetails.getDate());
	        return repository.save(existingFlightDetails);
	    }
	 
	
	/*
	 * @Autowired private RestTemplate template;
	 * 
	 * public TransactionResponse saveFlightDetails(TransactionRequest request) {
	 * String response=""; FlightDetails flightDetails = request.getFlightDetails();
	 * Payment payment = request.getPayment(); // Passenger passenger =
	 * request.getPassenger(); payment.setFlightId(flightDetails.getId());
	 * payment.setAmount(flightDetails.getPrice());
	 * 
	 * 
	 * // rest call Payment paymentResponse =
	 * template.postForObject("http://PaymentDetails/payment/doPayment", payment,
	 * Payment.class);
	 * 
	 * response = paymentResponse.getPaymentStatus().equals("success")
	 * ?"Payment proses successful":"failure in payment, added";
	 * 
	 * repository.save(flightDetails);
	 * 
	 * return new TransactionResponse(flightDetails,
	 * paymentResponse.getAmount(),paymentResponse.getTransactionId(),response); }
	 * 
	 * public FlightDetails saveFlightDetails(EmailRequest erequest) { String
	 * eresponse=""; FlightDetails flightDetails = erequest.getFlightDetails();
	 * Passenger passenger = erequest.getPassenger();
	 * passenger.setFlightId(flightDetails.getId());
	 * 
	 * 
	 * // rest call Passenger passengerResponse =
	 * template.postForObject("http://FlightPassenger/payment/doPayment", passenger,
	 * Passenger.class);
	 * 
	 * eresponse =
	 * passengerResponse.getEmailId().equals("success")?"Payment proses successful"
	 * :"failure in payment, added";
	 * 
	 * repository.save(flightDetails);
	 * 
	 * return new FlightDetails(); }
	 */
}
