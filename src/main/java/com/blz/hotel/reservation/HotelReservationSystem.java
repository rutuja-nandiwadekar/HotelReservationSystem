/* @Purpose: Ability to Add Hotel in a Hotel Reservation System With Hotel Name 
 * And Rates For Regular Customer
 */
package com.blz.hotel.reservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {

	// creation of arraylist
	ArrayList<Hotel> hotelDetails = new ArrayList<Hotel>();

	/*
	 * @Purpose : This method is used to Add Hotel details in arraylist
	 * 
	 * @Param : Hotel
	 */
	public void addHotelDetails(Hotel hotel) {
		hotelDetails.add(hotel);
	}

	public List<Hotel> getHotelList() {
		return hotelDetails;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System ");

	}
}
