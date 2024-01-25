package com.bus.reservation;

import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Booking {

	String passengerName;
	int busNo;
	Date date;

	Booking() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the name of passenger:");
		passengerName = Scanner.next();
		System.out.println("Enter bus no");
		busNo = Scanner.nextInt();
		System.out.println("Enter date dd-mm=yyyy");
		String dateInput = Scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public boolean isAvailable(ArrayList<Booking> booking, ArrayList<Bus> buses) {
		int Capacity = 0;
		for (Bus b : buses) {
			if (b.getbusno() == busNo) {
				Capacity = b.getCapacity();
			}
			int booked = 0;
			for (Booking s : booking) {
				if (s.busNo == busNo && s.date.equals(date)) {
					booked++;
				}
			}
			return booked < Capacity ? true : false;
		}
		return false;
	}
}
