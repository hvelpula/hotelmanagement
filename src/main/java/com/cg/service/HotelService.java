package com.cg.service;

import java.util.List;

import com.cg.entity.BookingsList;
import com.cg.entity.Hotel;

public interface HotelService {

	void save(Hotel h);
	List<Hotel> getHotels();
	void removeHotel(int hotelId);
	
	boolean ValidateAdminLogin(String userName, String password);
	
}
