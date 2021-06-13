package com.FlightBookingSystem.FlightBooking.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document
public class PassAccount {
	private double accountNumber;
	private String bankName;
	private String ifscNumber;
	
	
	public PassAccount() {
	}
	public PassAccount(double accountNumber, String bankName, String ifscNumber) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscNumber = ifscNumber;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscNumber() {
		return ifscNumber;
	}
	public void setIfscNumber(String ifscNumber) {
		this.ifscNumber = ifscNumber;
	}
	
	
}
