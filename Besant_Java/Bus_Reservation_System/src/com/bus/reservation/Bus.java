package com.bus.reservation;

public class Bus {

	private int busNo;
	private boolean Ac;
	private int Capacity;// get and set

	Bus(int no, Boolean Ac, int cap) {
		this.busNo = no;
		this.Ac = Ac;
		this.Capacity = cap;
	}

	public int getbusno() {
		return busNo;
	}

	public int getCapacity() {// Accessory method
		return Capacity;

	}

	public void setCapacity(int cap) {// mutator
		Capacity = cap;
	}

	public boolean getac() {
		return Ac;
	}

	public void setAc(boolean val) {
		Ac = val;
	}

	public void displayBusinfo() {
		System.out.println("Bus No:" + busNo + "Ac:" + Ac + "Total Capacity:" + Capacity);
	}
}
