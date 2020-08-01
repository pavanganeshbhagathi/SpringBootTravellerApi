package com.traveller.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traveller.model.Booking;
import com.traveller.model.Places;
import com.traveller.service.BookingService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/booking")
public class BookingController {


	
	@Autowired
	private BookingService bookingService;
	
	
	   @PostMapping(path="/createOrder")
		public ResponseEntity<Booking>  savePlace(@Valid @RequestBody Booking booking)
		{
		  
 Booking saveBooking = bookingService.saveBooking(booking);
			
			return new ResponseEntity<Booking>(saveBooking, HttpStatus.CREATED);
		}
		
}
