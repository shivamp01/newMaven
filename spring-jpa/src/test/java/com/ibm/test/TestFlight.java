package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.Entity.Flight;
import com.ibm.repo.FlightRepository;
import com.ibm.repo.FlightRepositoryImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class TestFlight {
	
	@Autowired
	private FlightRepository dao;
	
	@Test
	public void saveFlight() {
		Flight f=new Flight("xyz","Mumbai","California","Indigo");
		assertEquals("xyz", dao.save(f));
	}
	
	@Test
	public void fetchFlight() {
		
		assertNotNull(dao.fetch("abc"));
	}
	
	@Test
	public void fetchAllFlights() {
		List<Flight> flight=dao.fetchAll();
		assertNotNull(flight);
		//flight.forEach(System.out::println);
	}
	
	@Test
	public void removeFlight() {
		assertTrue(dao.remove("abc"));
	}
	
	@Test
	public void updateFlight() {
		Flight f=new Flight();
		f.setCode("abc");
		f.setFrom("blr");
		f.setTo("ngp");
		f.setCarrier("5678");
		assertTrue(dao.update(f));
	}
	@Test
	public void fetchFlightByCarrier() {
		List<Flight> f=dao.findByCarrier("indigo");
		assertNotNull(f);
		f.forEach(System.out::println);
	}
}
