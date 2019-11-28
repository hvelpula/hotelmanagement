package com.cg.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.TravelAgencyLogin;
import com.cg.repo.TravelAgencyRepo;
import com.cg.service.TravelAgencyService;

@Service
@Transactional
public class TravelAgencyServiceImpl implements TravelAgencyService{
	@Autowired
	private TravelAgencyRepo travelRepo;

	
	@Override
	public void save(TravelAgencyLogin t) {
		travelRepo.save(t);

		
	}
	@Override
	public boolean ValidateTravelLogin(String userName, String password) {
		TravelAgencyLogin user=travelRepo.validateTravelLogin(userName);
		if(user != null) {
		String pwd=user.getPassword();
		if(pwd.equals(password))
			return true;
		else
			return false;
		}
		else
			return false;
		
	}

}
