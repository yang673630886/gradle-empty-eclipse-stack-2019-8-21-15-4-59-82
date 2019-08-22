package com.car;

public class Truck extends Car {

	private String payload;

	public Truck(String engine, String wheels, String payload) {
		super(engine, wheels);
		this.payload = payload;
	}

	public String start() {
		return "tips," + super.engine + " is on and " + super.wheels + " are running!";
	}

	public String load() {
		return payload + " is loading goods";
	}

}
