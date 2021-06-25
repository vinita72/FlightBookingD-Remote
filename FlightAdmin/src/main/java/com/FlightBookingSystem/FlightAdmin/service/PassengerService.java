package com.FlightBookingSystem.FlightAdmin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FlightBookingSystem.FlightAdmin.model.Passenger;
import com.FlightBookingSystem.FlightAdmin.repository.PassengerRepo;




@Service
public class PassengerService {
	
	@Autowired
	 private PassengerRepo repository;
	
		/*
		 * @GetMapping("/findAllPassenger") public List<Passenger> getPassenger(){
		 * return repository.findAll(); }
		 * 
		 * @GetMapping("/findAllPassenger/{id}") public Optional<Passenger>
		 * getPassenger(@PathVariable int id){ return repository.findById(id); }
		 * 
		 * @DeleteMapping("/delete/{id}") public String deletePassenger(@PathVariable
		 * int id) { repository.deleteById(id); return "passenger deleted with id: "
		 * +id; }
		 */
  
		public List<Passenger> getPassenger(){
			return repository.findAll();
		}
		
		public Optional<Passenger> getPassengerById(@PathVariable int id){
			return repository.findById(id);
		}
		
		
		public Passenger savePassenger(Passenger passenger) {
			return repository.save(passenger);
		}
		
		public Passenger fetchPassengerByEmailId(String emailId) {
			return repository.findByEmailId(emailId);
		}
		
		public Passenger fetchPassengerByEmailIdAndPassword(String emailId, String password) {
			return repository.findByEmailIdAndPassword(emailId, password);
		}
	}

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Optional<Passenger> passenger = PassengerRepo.findByirstName(username);
//
//		passenger.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
//
//        return passenger.map(Passenger::new).get();	}
//}
