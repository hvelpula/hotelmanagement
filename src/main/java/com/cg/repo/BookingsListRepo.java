package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entity.BookingsList;

public interface BookingsListRepo extends JpaRepository<BookingsList, Integer> {
	
	@Modifying(clearAutomatically=true)
	@Query("update BookingsList booklist set booklist.bookingStatus = :bookingStatus where booklist.bookingId=:bookingId")
	public int updateBookingStatus(@Param("bookingStatus") String bookingStatus, @Param("bookingId") Integer bookingId);
	
	@Query("select booking from BookingsList booking where booking.hotelName= :hotelName")
	List<BookingsList> getBookingsListByUserName(@Param("hotelName") String hotelName);
}
