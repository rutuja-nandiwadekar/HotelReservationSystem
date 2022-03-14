package com.blz.hotel.reservation;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class HotelReservationSystemTest {
	/*
	 * @Purpose : Testing code by using test case hotel is added or not
	 */
	@Test
	public void givenHotelDetails_WhenAdded_ShoulReturnTrue() {
		try {
			Hotel hotel1 = new Hotel("Lakewood", 1000);
			Hotel hotel2 = new Hotel("Bridgewood", 2000);
			Hotel hotel3 = new Hotel("Ridgewood", 5000);
			HotelReservationSystem hotelReservation = new HotelReservationSystem();
			hotelReservation.addHotelDetails(hotel1);
			hotelReservation.addHotelDetails(hotel2);
			hotelReservation.addHotelDetails(hotel3);
			List<Hotel> result = hotelReservation.getHotelList();
			assertTrue(result.contains(hotel1));
			assertTrue(result.contains(hotel2));
			assertTrue(result.contains(hotel3));
		} catch (Exception e) {
			System.out.println("hotel details not added successfully..");
		}
	}
}
