package com.FlightBookingSystem.FlightPassenger.model;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *  @author admin
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection ="passenger")
public class Passenger{

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private double phoneNumber;
	private double pnrNumber;
	private String address;
	private List<PassAccount> passAccount;

	
	
	
//	private Object active;
//	private String roles;
//	private Object authorities;
//	
	
	public Passenger() {
	
	}
	public Passenger(int id, String firstName, String lastName, String password, String emailId, double phoneNumber,
			double pnrNumber, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.pnrNumber = pnrNumber;
		this.address = address;
	}

	
	public Passenger(int id, String firstName, String lastName, String password, String emailId, double phoneNumber,
		double pnrNumber, String address, List<PassAccount> passAccount) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.password = password;
	this.emailId = emailId;
	this.phoneNumber = phoneNumber;
	this.pnrNumber = pnrNumber;
	this.address = address;
	this.passAccount = passAccount;
}
	
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(double pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<PassAccount> getPassAccount() {
		return passAccount;
	}

	public void setPassAccount(List<PassAccount> passAccount) {
		this.passAccount = passAccount;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", pnrNumber=" + pnrNumber + ", address="
				+ address + ", passAccount=" + passAccount + "]";
	}
	
	
	
	
//	  public Passenger(Passenger passenger) {
//	        this.emailId = passenger.getEmailId();
//	        this.password = passenger.getPassword();
//	        this.active = passenger.isActive();
//	        this.authorities = Arrays.stream(passenger.getRoles().split(","))
//	                    .map(SimpleGrantedAuthority::new)
//	                    .collect(Collectors.toList());
//	    }
//	  public String getRoles() {
//	        return roles;
//	    }
//	private Object isActive() {
//		// TODO Auto-generated method stub
//		return active;
//	}
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}
	
	
		
	
	
	
	
}
