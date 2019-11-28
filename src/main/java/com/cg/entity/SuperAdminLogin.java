package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "super_admin")
public class SuperAdminLogin {
	@Id
	@Column(length = 15)
	private String userName;
	@Column(length = 15)
	private String password;
	
	
	public SuperAdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SuperAdminLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "SuperAdmin [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
