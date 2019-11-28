package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.BookingsList;
import com.cg.entity.Hotel;
import com.cg.service.HotelService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class HotelController {
	@Autowired
	private HotelService hotelService;

	@PostMapping(value = "/addNewHotel", consumes = "application/json")
	public void addNewHotel(@RequestBody Hotel h) {
		System.out.println("addd");
		hotelService.save(h);
	}
	

	@GetMapping(value = "/getHotels", produces = "application/json")
	public List<Hotel> getHotels() {
		return hotelService.getHotels();
	}

	
	@DeleteMapping("/deleteHotel/{hotelId}")
	public void removeHotel(@PathVariable int hotelId) {
		hotelService.removeHotel(hotelId);
	}
	
	@GetMapping(value="/adminlogin/{username}/{password}")
	public boolean ValidateAdminLogin(@PathVariable ("username") String username, @PathVariable ("password") String password)
	{
		System.out.println("Harsha");
		boolean valid=hotelService.ValidateAdminLogin(username,password);
		return valid;
			
	}
	
	
	

}
