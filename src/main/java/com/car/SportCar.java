package com.car;

public class SportCar extends Car {

	private String lights;

	public SportCar(String engine, String wheels, String lights) {
		super(engine, wheels);
		this.lights = lights;
	}

	public String start() {
		return (this.lights + " are shining, " + super.engine + " is on and " + super.wheels + " are running!");
	}

	public String speedOn() {
		return (super.engine + " is overload and " + super.wheels + " are super running!");
	}
}
