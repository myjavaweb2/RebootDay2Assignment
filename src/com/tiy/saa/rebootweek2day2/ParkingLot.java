package com.tiy.saa.rebootweek2day2;

public class ParkingLot {

	public static void main(String[] args) {
		EighteenWheeler megatron = new EighteenWheeler(true, "grey", "battle-hardened", true, 3, 18, true, "Honk Honk");

		Motorcycle rocket = new Motorcycle(true, "red", "new", true, 1, 2, true);

		System.out.println(rocket.getNumberOfSeats());
		rocket.doWeHaveASidecar();
		System.out.println(rocket.getNumberOfSeats());

	}

}
