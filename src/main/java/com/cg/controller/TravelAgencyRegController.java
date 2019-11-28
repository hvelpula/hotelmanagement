package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.BookingsList;
import com.cg.entity.Hotel;
import com.cg.entity.TravelAgencyReg;
import com.cg.service.TravelAgencyRegService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TravelAgencyRegController {

	@Autowired
	private TravelAgencyRegService service;

	@PostMapping(value = "/roomBooking", consumes = "application/json")
	public void save(@RequestBody TravelAgencyReg t) {
		System.out.println("addd");
		service.save(t);
	}
	
	
}
