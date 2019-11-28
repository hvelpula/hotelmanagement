package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.AdminLogin;
import com.cg.entity.TravelAgencyLogin;
@Repository
public interface TravelAgencyRepo extends JpaRepository<TravelAgencyLogin, String> {
	
	@Query("SELECT travellogin FROM TravelAgencyLogin travellogin WHERE travellogin.userName= (:userName)")
	TravelAgencyLogin validateTravelLogin(@Param("userName") String userName);

}
