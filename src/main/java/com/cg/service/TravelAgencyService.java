package com.cg.service;

import java.util.List;

import com.cg.entity.Hotel;
import com.cg.entity.TravelAgencyLogin;

public interface TravelAgencyService {

	void save(TravelAgencyLogin t);
	boolean ValidateTravelLogin(String userName, String password);


}
