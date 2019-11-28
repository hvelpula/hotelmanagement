package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.SuperAdminLogin;
import com.cg.entity.TravelAgencyLogin;
import com.cg.service.TravelAgencyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TravelAgencyController {

	@Autowired
	private TravelAgencyService tservice;

	@PostMapping(value = "/travelagencypage", consumes = "application/json")
	public void save1(@RequestBody TravelAgencyLogin t) {
		System.out.println("addd");
		tservice.save(t);
	}
	@GetMapping(value="/travelagencylogin/{userName}/{password}")
	public boolean validateTravelLogin(@PathVariable ("userName") String userName, @PathVariable ("password") String password)
	{
		System.out.println("Harsha");
		boolean valid=tservice.ValidateTravelLogin(userName,password);
		return valid;
			
	}
}
