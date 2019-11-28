package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.AdminLogin;
import com.cg.entity.SuperAdminLogin;
import com.cg.service.AdminLoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api")
public class AdminLoginController {
	@Autowired
	private AdminLoginService aservice;
	
	@PostMapping(value = "/admin", consumes = "application/json")
	public void save(@RequestBody AdminLogin a) {
		System.out.println("addd");
		aservice.save(a);
	}
	
}
