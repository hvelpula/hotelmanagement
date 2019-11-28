package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "travelagency")
public class TravelAgencyReg {
	@Id
	@GeneratedValue
	@Column(length = 5)
	private int id;
	@Column(length = 15)
	private String firstName;
	@Column(length = 15)
	private String lastName;
	@Column(length = 10)
	private String mobileNo;
	@Column(length = 30)
	private String email;
	@Column(length = 15)
	private String city;
	@Column(length = 15)
	private String district;
	@Column(length = 15)
	private String state;
	@Column(length = 15)
	private String location;	
	private String checkIn;
	private String checkOut;
	private String adult;
	private String child;
	@Column(length = 50)
	private String address;


public TravelAgencyReg() {
	super();
	// TODO Auto-generated constructor stub
}

public TravelAgencyReg(String firstName, String lastName, String mobileNo, String email, String city, String district,
		String state, String location, String checkIn, String checkOut, String adult, String child, String address, int id) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mobileNo = mobileNo;
	this.email = email;
	this.city = city;
	this.district = district;
	this.state = state;
	this.location = location;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
	this.adult = adult;
	this.child = child;
	this.address = address;
	this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getCheckIn() {
	return checkIn;
}

public void setCheckIn(String checkIn) {
	this.checkIn = checkIn;
}

public String getCheckOut() {
	return checkOut;
}

public void setCheckOut(String checkOut) {
	this.checkOut = checkOut;
}

public String getAdult() {
	return adult;
}

public void setAdult(String adult) {
	this.adult = adult;
}

public String getChild() {
	return child;
}

public void setChild(String child) {
	this.child = child;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}



}
