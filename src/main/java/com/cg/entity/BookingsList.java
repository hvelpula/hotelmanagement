package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookingslist")
public class BookingsList {
	@Id
	@GeneratedValue
	@Column(length = 4)
	private int bookingId;
	@Column(length = 15)
	private String hotelName;
	private String roomType;
	@Column(length = 5)
	private String roomNo;
	@Column(length = 5)
	private double price;
	@Column(length = 25)
	private String hotelAddress;
	@Column(length = 4)
	private int hotelId;

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
	private String bookingStatus;

	public BookingsList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingsList(int bookingId, String hotelName, String roomType, String roomNo, double price,
			String hotelAddress, int hotelId, String firstName, String lastName, String email, String mobileNo,
			String city, String district, String state, String location, String checkIn, String checkOut, String adult,
			String child, String address, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.roomNo = roomNo;
		this.price = price;
		this.hotelAddress = hotelAddress;
		this.hotelId = hotelId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.city = city;
		this.district = district;
		this.state = state;
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adult = adult;
		this.child = child;
		this.address = address;
		this.bookingStatus = bookingStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
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

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "BookingsList [bookingId=" + bookingId + ", hotelName=" + hotelName + ", roomType=" + roomType
				+ ", roomNo=" + roomNo + ", price=" + price + ", hotelAddress=" + hotelAddress + ", hotelId=" + hotelId
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", city=" + city + ", district=" + district + ", state=" + state + ", location=" + location
				+ ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", adult=" + adult + ", child=" + child
				+ ", address=" + address + ", bookingStatus=" + bookingStatus + "]";
	}

	
}
