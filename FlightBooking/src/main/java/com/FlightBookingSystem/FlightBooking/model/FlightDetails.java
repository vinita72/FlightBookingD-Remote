package com.FlightBookingSystem.FlightBooking.model;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document
public class FlightDetails{
	@Id
	private int id;	
	private String fromlocation;
	private String tolocation;
	private int total_seats;
	//private String FirstName;
	//private String emailId;
	//private String paymentStatus;
	private double price;
	
	private String date;
	
	public FlightDetails() {
		super();
	}

	public FlightDetails(int id, String fromlocation, String tolocation, int total_seats, double price, String date) {
		super();
		this.id = id;
		this.fromlocation = fromlocation;
		this.tolocation = tolocation;
		this.total_seats = total_seats;
		this.price = price;
		this.date = date;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromlocation() {
		return fromlocation;
	}
	public void setFromlocation(String fromlocation) {
		this.fromlocation = fromlocation;
	}
	public String getTolocation() {
		return tolocation;
	}
	public void setTolocation(String tolocation) {
		this.tolocation = tolocation;
	}
	public int getTotal_seats() {
		return total_seats;
	}
	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "FlightDetails [id=" + id + ", fromlocation=" + fromlocation + ", tolocation=" + tolocation
				+ ", total_seats=" + total_seats + ", price=" + price + ", date=" + date + "]";
	}

	

	

	/*
	 * @Override public int size() { // TODO Auto-generated method stub return 0; }
	 * 
	 * 
	 * @Override public boolean isEmpty() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * @Override public boolean contains(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public Iterator<FlightDetails> iterator() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * @Override public Object[] toArray() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 * @Override public <T> T[] toArray(T[] a) { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * 
	 * @Override public boolean add(FlightDetails e) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public boolean remove(Object o) { // TODO Auto-generated method
	 * stub return false; }
	 * 
	 * 
	 * @Override public boolean containsAll(Collection<?> c) { // TODO
	 * Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean addAll(Collection<? extends FlightDetails> c) { //
	 * TODO Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean addAll(int index, Collection<? extends
	 * FlightDetails> c) { // TODO Auto-generated method stub return false; }
	 * 
	 * 
	 * @Override public boolean removeAll(Collection<?> c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * @Override public boolean retainAll(Collection<?> c) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * @Override public void clear() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * @Override public FlightDetails get(int index) { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * 
	 * @Override public FlightDetails set(int index, FlightDetails element) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public void add(int index, FlightDetails element) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * @Override public FlightDetails remove(int index) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * 
	 * @Override public int indexOf(Object o) { // TODO Auto-generated method stub
	 * return 0; }
	 * 
	 * 
	 * @Override public int lastIndexOf(Object o) { // TODO Auto-generated method
	 * stub return 0; }
	 * 
	 * 
	 * @Override public ListIterator<FlightDetails> listIterator() { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public ListIterator<FlightDetails> listIterator(int index) { //
	 * TODO Auto-generated method stub return null; }
	 * 
	 * 
	 * @Override public List<FlightDetails> subList(int fromIndex, int toIndex) { //
	 * TODO Auto-generated method stub return null; }
	 */
	
	
	
}
