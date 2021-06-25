package com.FlightBookingSystem.FlightBooking.model;

public class Booking {
 
	
	private int id;
	private String emailId;
	private double price;
	
	
	public Booking(int id, String emailId, double price) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
