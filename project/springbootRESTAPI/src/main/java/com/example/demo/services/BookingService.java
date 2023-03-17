package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Owner;
import com.example.demo.repositories.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository brepo;
	
	public Booking saveBookingVehicle(Booking b)
	{
		return brepo.save(b);
	}
	
	
}
