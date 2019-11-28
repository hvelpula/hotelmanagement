package com.cg.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.cg.entity.BookingsList;

public interface BookingsListService {

	public int book(BookingsList booklist);
	List<BookingsList> getBookingsList();
	void removeRoom(int bookingId);
	public void updateBookingStatus(String bookingStatus,int bookingId);
	List<BookingsList> getBookingsListByUserName(String userName);

}
