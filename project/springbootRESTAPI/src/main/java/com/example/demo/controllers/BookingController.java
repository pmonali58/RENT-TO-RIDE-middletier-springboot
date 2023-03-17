package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.entities.Booking;
import com.example.demo.entities.Login;
import com.example.demo.entities.Owner;
import com.example.demo.entities.OwnerReg;
import com.example.demo.services.BookingService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BookingController {

	@Autowired
	BookingService bservice;
	
	@PostMapping("/Booking")
	public Booking saveBookVehicle(@RequestBody Booking b)
	{
		System.out.println(b);
	 return bservice.saveBookingVehicle(b);
	}
	
}
