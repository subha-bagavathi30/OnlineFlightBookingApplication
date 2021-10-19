package com.example.service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entities.Airport;

@Component
@Service
public interface AirportService {
	public Iterable<Airport> viewAllAirport();
	public Airport viewAirport(String airportCode);
	public ResponseEntity<Airport> addAirport(Airport airport);
	public Airport modifyAirport(Airport airport);
	public String removeAirport(String airportCode);
	public Iterable<Airport> findAll();

}