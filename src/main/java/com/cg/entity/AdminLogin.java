package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class AdminLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 15)
	private String userName;
	@Column(length = 15)
	private String password;

	public AdminLogin() {
		super();
	}

	public AdminLogin(String userName, String password) {
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
		return "AdminLogin [userName=" + userName + ", password=" + password + "]";
	}

}
