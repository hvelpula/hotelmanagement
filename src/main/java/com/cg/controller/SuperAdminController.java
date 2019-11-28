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
import com.cg.service.SuperAdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SuperAdminController {
	@Autowired
	private SuperAdminService sService;
	@PostMapping(value = "/superadmin", consumes = "application/json")
	public void save2(@RequestBody SuperAdminLogin s) {
		System.out.println("addd");
		sService.save(s);
	}
	@GetMapping(value="/superadminlogin/{userName}/{password}")
	public boolean ValidateSuperAdminLogin(@PathVariable ("userName") String userName, @PathVariable ("password") String password)
	{
		System.out.println("Harsha");
		boolean valid=sService.ValidateSuperAdminLogin(userName,password);
		return valid;
			
	}
	
}
