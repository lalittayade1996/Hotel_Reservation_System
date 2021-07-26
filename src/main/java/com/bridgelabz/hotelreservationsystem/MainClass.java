package com.bridgelabz.hotelreservationsystem;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System!");

		HotelReservationSystem hotelSystem = new HotelReservationSystem();
		hotelSystem.addHotel(new HotelClass("Lakewood", 110));
		hotelSystem.addHotel(new HotelClass("Bridgewood", 160));
		hotelSystem.addHotel(new HotelClass("Ridgewood", 220));
		System.out.println("Hotels are added!");
	}
}