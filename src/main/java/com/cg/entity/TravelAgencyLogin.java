package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "travel_login")
public class TravelAgencyLogin {
	@Id
	@Column(length = 15)
	private String firstName;
	@Column(length = 15)
	private String lastName;
	@Column(length = 15)
	private String mobileNo;
	@Column(length = 15)
	private String plocation;
	@Column(length = 15)
	private String userName;
	@Column(length = 15)
	private String password;
		
	public TravelAgencyLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TravelAgencyLogin(String firstName, String lastName, String mobileNo, String plocation, String userName,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.plocation = plocation;
		this.userName = userName;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
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
		return "TravelAgencyLogin [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ ", plocation=" + plocation + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
	
