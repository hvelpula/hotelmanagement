package com.cg.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.entity.TravelAgencyReg;
import com.cg.repo.TravelAgencyRegRepo;
import com.cg.service.TravelAgencyRegService;

@Service
@Transactional
public class TravelAgencyRegServiceImpl implements TravelAgencyRegService {

	@Autowired
	private TravelAgencyRegRepo repo;

	@Override
	public void save(TravelAgencyReg t) {
		repo.save(t);
	}
	

	
		
	}

