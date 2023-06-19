package com.dxc.project.service;

import com.dxc.project.model.Booking;

public interface BookingService {
	public Booking makeBooking(Booking book);
	public void delBooking(int bookingId);

}
