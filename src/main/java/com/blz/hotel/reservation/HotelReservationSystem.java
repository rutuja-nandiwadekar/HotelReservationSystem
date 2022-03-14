package com.blz.hotel.reservation;

import java.util.ArrayList;

public class HotelReservationSystem {
	// creation of arraylist
	ArrayList<Hotel> hotelDetails = new ArrayList<Hotel>();

	/*
	 * @purpose: This is the method to add a new hotel details
	 * 
	 * @param: hotelName, regularCustomerRate
	 *
	 * @return: returns hotel details
	 */
	public Hotel addHotelDetails(String hotelName, double regularCustomerRate) {
		Hotel add = new Hotel(hotelName, regularCustomerRate);
		add.setHotelName(hotelName);
		add.setRegularCustomerRate(regularCustomerRate);
		hotelDetails.add(add);
		System.out.println(add);
		return add;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ");
		HotelReservationSystem addHotel = new HotelReservationSystem();

		addHotel.addHotelDetails("Lakewood", 1000);
		addHotel.addHotelDetails("Bridgewood", 2000);
	}
}
