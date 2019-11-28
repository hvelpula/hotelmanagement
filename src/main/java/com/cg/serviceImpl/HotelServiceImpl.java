package com.cg.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.AdminLogin;
import com.cg.entity.BookingsList;
import com.cg.entity.Hotel;
import com.cg.entity.TravelAgencyLogin;
import com.cg.repo.HotelRepo;
import com.cg.service.HotelService;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public void save(Hotel h) {
		hotelRepo.save(h);
	}

	@Override
	public List<Hotel> getHotels() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public void removeHotel(int hotelId) {
		// TODO Auto-generated method stub
		hotelRepo.deleteById(hotelId);
	}

	
	@Override
	public boolean ValidateAdminLogin(String username, String password) {
		Hotel user=hotelRepo.validateAdminLogin(username);
		if(user != null)
		{
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
