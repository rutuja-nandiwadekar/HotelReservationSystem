package com.blz.hotel.reservation;

public class Hotel {
	// initialization of variable
	String hotelName;
	double regularCustomerRate;

	// constructor
	public Hotel(String hotelName, double regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
	}

	// generating getter and setter
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRegularCustomerRate() {
		return regularCustomerRate;
	}

	public void setRegularCustomerRate(double regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate + "]";
	}
}
