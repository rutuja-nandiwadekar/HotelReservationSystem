package com.blz.hotel.reservation;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HotelReservationSystemTest {

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnTrue() {
		HotelReservationSystem addHotel = new HotelReservationSystem();
		Hotel hotel = addHotel.addHotelDetails("Lakewood", 1000);
		assertTrue(hotel.getHotelName(), true);
	}

	@Test
	public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShoulReturnFalse() {

		Hotel hotel = new Hotel("Lakewood", 1000);
		assertNotEquals("Lakewo", hotel.getHotelName());
		assertNotEquals(1000, hotel.getRegularCustomerRate());
	}
}
