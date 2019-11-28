package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.entity.SuperAdminLogin;
import com.cg.entity.TravelAgencyLogin;


public interface SuperAdminRepo extends JpaRepository<SuperAdminLogin, String> {
	@Query("SELECT superAdmin FROM SuperAdminLogin superAdmin WHERE superAdmin.userName= (:userName)")
	SuperAdminLogin validateSuperAdminLogin(@Param("userName") String userName);

}
