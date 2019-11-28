package com.cg.service;

import com.cg.entity.SuperAdminLogin;

public interface SuperAdminService {
	 boolean ValidateSuperAdminLogin(String userName, String password);
	void save(SuperAdminLogin s);

}
