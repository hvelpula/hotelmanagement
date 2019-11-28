package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.BookingsList;
import com.cg.entity.Hotel;
import com.cg.service.BookingsListService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BookingsListController {
	@Autowired
	private BookingsListService bookingService;

	@PostMapping(value = "/addBookings", consumes = "application/json")
	public int book(@RequestBody BookingsList booklist) {
		System.out.println("addd");
		return bookingService.book(booklist);
	}

	@GetMapping(value = "/getList", produces = "application/json")
	public List<BookingsList> getBookingsList() {
		return bookingService.getBookingsList();
	}

	@DeleteMapping(value = "/deleteRoom/{bookingId}")
	public void removeRoom(@PathVariable int bookingId) {
		bookingService.removeRoom(bookingId);
	}

	@GetMapping(value = "/updateStatus/{bookingStatus}/{bookingId}")
	public void updateBookingStatus(@PathVariable String bookingStatus,@PathVariable int bookingId) {
		System.out.println(bookingStatus+" "+bookingId);
		bookingService.updateBookingStatus(bookingStatus, bookingId);
	}
	
	
	@GetMapping(value = "/getHotelsByuserName/{userName}")
	public List<BookingsList> getBookingsListByUserName(@PathVariable String userName){
		return bookingService.getBookingsListByUserName(userName);
	}
}
