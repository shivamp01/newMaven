package com.ibm.repo;

import java.util.List;

import com.ibm.Entity.Flight;

public interface FlightRepository {

	String save(Flight f);
	
	Flight fetch(String code);
	
	List<Flight> fetchAll();
	
	boolean remove(String code);
	
	boolean update(Flight f);
	
	List<Flight> findByCarrier(String carrier);
}
