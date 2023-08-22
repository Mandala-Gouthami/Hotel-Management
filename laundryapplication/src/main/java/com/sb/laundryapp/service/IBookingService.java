package com.sb.laundryapp.service;

import java.time.LocalDate;
import java.util.List;

import com.sb.laundryapp.beans.Booking;



public interface IBookingService {

	Booking addBooking(Booking booking);

	Booking removeBooking(long bookingId);

	Booking updateBooking(long bookingId, Booking booking);

	Booking getBooking(long bookingId);

	List<Booking> getAllBookings();

	List<Booking> getBookingsByDate(LocalDate localDate);

	List<Booking> getBookingsByCustomer(String customerId);
}