package com.dxc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.project.model.Booking;
import com.dxc.project.service.BookingService;

@RestController
@RequestMapping("/user/booking")
public class BookingController {

	@Autowired
	private BookingService service;
	
	@PostMapping("makeBooking")
	public Booking makeBooking(@RequestBody Booking book) {
		return service.makeBooking(book);
	}
	
	@PutMapping("modifyBooking/{bookingId}")
	public Booking editBooking(@PathVariable("bookingId") int bookingId, @RequestBody Booking book) {
		return service.modifyBooking(bookingId, book);
	}
	
	@DeleteMapping("cancelBooking/{bookingId}")
	public void deleteBooking(@PathVariable int bookingId) {
		service.delBooking(bookingId);
	}
}
