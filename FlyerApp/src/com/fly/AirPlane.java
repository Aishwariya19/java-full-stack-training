package com.fly;

public class AirPlane extends Vehicle implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("AirPlane takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("AirPlane landing");
		
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flying");
		
	}

	
}
