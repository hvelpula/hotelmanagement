package com.cg.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.AdminLogin;
import com.cg.repo.AdminLoginRepo;
import com.cg.service.AdminLoginService;
@Service
@Transactional
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginRepo adminrepo;

	

	@Override
	public void save(AdminLogin a) {
adminrepo.save(a);		
	}

	
}
 