package com.cg.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.SuperAdminLogin;
import com.cg.entity.TravelAgencyLogin;
import com.cg.repo.SuperAdminRepo;
import com.cg.service.SuperAdminService;

@Service
@Transactional
public class SuperAdminServiceImpl implements SuperAdminService{
	@Autowired
	private SuperAdminRepo sadminRepo;

	
	@Override
	public boolean ValidateSuperAdminLogin(String userName, String password) {
		SuperAdminLogin user=sadminRepo.validateSuperAdminLogin(userName);
		String pwd=user.getPassword();
		if(pwd.equals(password))
			return true;
		else
			return false;
	}
	

	@Override
	public void save(SuperAdminLogin s) {
		sadminRepo.save(s);
		
	}
}
