package com.car;


public abstract class Car {
	protected String engine;
	protected String wheels;

	public Car(String engine, String wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}

	public abstract String start();
}
