package com.cg.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.BookingsList;
import com.cg.repo.BookingsListRepo;
import com.cg.repo.HotelRepo;
import com.cg.service.BookingsListService;

@Service
@Transactional
public class BookingsListServiceImpl implements BookingsListService {
	@Autowired
	private BookingsListRepo bookingRepo;
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public int book(BookingsList booklist) {
		
		BookingsList book=bookingRepo.save(booklist);
		return book.getBookingId();
	}
	
	public List<BookingsList> getBookingsList(){
		System.out.println("one........");
		return bookingRepo.findAll();
	}

	@Override
	public void removeRoom(int bookingId) {

		bookingRepo.deleteById(bookingId);
		
	}

	@Override
	public void updateBookingStatus(String bookingStatus, int bookingId) {
		System.out.println(bookingId);
		bookingRepo.updateBookingStatus(bookingStatus,bookingId);
	}

	@Override
	public List<BookingsList> getBookingsListByUserName(String userName) {
		String hotelName=hotelRepo.getHotelNameByUserName(userName);
		System.out.println(hotelName);
		
		return bookingRepo.getBookingsListByUserName(hotelName);
	}

	


}
