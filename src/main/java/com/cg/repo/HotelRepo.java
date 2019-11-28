package com.cg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entity.AdminLogin;
import com.cg.entity.Hotel;
import com.cg.entity.TravelAgencyLogin;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {
	
	
	@Query("SELECT hotel FROM Hotel hotel WHERE hotel.username= (:username)")
	Hotel validateAdminLogin(@Param("username") String userName);
	
	@Query("SELECT distinct(hotel.hotelName) FROM Hotel hotel WHERE hotel.username= (:userName)")
	String getHotelNameByUserName(@Param("userName") String userName);

}
