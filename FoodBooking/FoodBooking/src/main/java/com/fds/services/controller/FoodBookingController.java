package com.fds.services.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fds.services.model.Booking;
import com.fds.services.repository.BookingRepository;

@RestController
@RequestMapping("fds/v1")
public class FoodBookingController {

	private BookingRepository bookingRepository;
	
	
	@PostMapping("/bookingOrder")
	public Booking bookOrder(@RequestBody Booking booking){
		return bookingRepository.save(booking);
	}
	
	
	@GetMapping("/getBookingDetails")
	public ResponseEntity<List<Booking>> getAllBooking() {

		List<Booking> bookingList = bookingRepository.findAll();

		return new ResponseEntity<>(bookingList, HttpStatus.OK);
	}
	
	@GetMapping("/getBookingById")
	public ResponseEntity<Booking> getBookingById(Integer id) {

		Optional<Booking> booking = bookingRepository.findById(id);

		return new ResponseEntity<>(booking.get(), HttpStatus.OK);
	}
	
	
}
