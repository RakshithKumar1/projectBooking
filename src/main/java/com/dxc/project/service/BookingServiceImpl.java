package com.dxc.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.project.model.Booking;
import com.dxc.project.repo.BookingRepo;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepo repo;
	
	
	
	@Override
	public Booking makeBooking(Booking book) {
		// TODO Auto-generated method stub
		return repo.save(book);
		
	}

	@Override
	public Booking modifyBooking(int bookingId,Booking book) {
		// TODO Auto-generated method stub
		
		Booking b = repo.findById(bookingId).get();
		
		
		if((book.getRoomId()!=0)) {
			b.setRoomId(book.getRoomId());
		}
		if((book.getCheckInDate()!=null) && !"".equalsIgnoreCase(book.getCheckInDate())) {
			b.setCheckInDate(book.getCheckInDate());
		}
		if((book.getCheckOutDate()!=null) && !"".equalsIgnoreCase(book.getCheckOutDate())) {
			b.setCheckOutDate(book.getCheckOutDate());
		}
		return repo.save(b);
}
	

	@Override
	public void delBooking(int bookingId) {
		// TODO Auto-generated method stub
		repo.delete(read(bookingId));
	}
	public Booking read(int bookingId) {
		Booking result = null;
		Optional<Booking> temp = repo.findById(bookingId);
		if(temp.isPresent()) {
			result = repo.findById(bookingId).get();
		}
		return result;
	}
}
