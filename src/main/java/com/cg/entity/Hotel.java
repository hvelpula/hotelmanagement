package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	@Id
	@GeneratedValue
	@Column(length = 4)
	private int hotelId;
	@Column(length = 15)
	private String hotelName;
	private String roomType;
	@Column(length = 5)
	private int roomNo;
	@Column(length = 5)
	private double price;
	@Column(length = 25)
	private String hotelAddress;
	@Column(length = 15)
	private String username;
	@Column(length = 15)
	private String password;
	

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Hotel(int hotelId, String hotelName, String roomType, int roomNo, double price, String hotelAddress,
			 String username, String password) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.roomNo = roomNo;
		this.price = price;
		this.hotelAddress = hotelAddress;
		//this.isBooked = isBooked;
		this.username = username;
		this.password = password;
	}


	public int getHotelId() {
		return hotelId;
	}


	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public int getRoomNo() {
		return roomNo;
	}


	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getHotelAddress() {
		return hotelAddress;
	}


	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}


//	public boolean isBooked() {
//		return isBooked;
//	}
//
//
//	public void setBooked(boolean isBooked) {
//		this.isBooked = isBooked;
//	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", roomType=" + roomType + ", roomNo="
				+ roomNo + ", price=" + price + ", hotelAddress=" + hotelAddress + ", username=" + username + ", password=" + password + "]";
	}

}