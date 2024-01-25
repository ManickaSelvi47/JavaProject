package com.bus.reservation;

import java.util.Scanner;
import java.util.ArrayList;

public class BusReserv {
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();

		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, true, 3));
		buses.add(new Bus(3, true, 4));

		ArrayList<Booking> booking = new ArrayList<Booking>();
		int useropt = 1;
		Scanner scanner = new Scanner(System.in);

		for (Bus b : buses) {
			b.displayBusinfo();
		}

		while (useropt == 1) {
			System.out.println("Enter 1 to book and 2 to exite");
			useropt = scanner.nextInt();
			if (useropt == 1) {
				Booking book = new Booking();
				if (book.isAvailable(booking, buses)) {

					booking.add(book);
					System.out.println("your booking is conformed");
				} else
					System.out.println("Sorry.Bus is full.Try another bus or date.");

			}
		}

	}

}
