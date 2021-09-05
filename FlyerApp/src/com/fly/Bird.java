package com.fly;

public class Bird extends Animal implements Flyer{
	
	
	@Override
	public void takeOff() {
		System.out.println("bird takingoff");
		
	}

	@Override
	public void land() {
		System.out.println("bird landing");
		
	}

	@Override
	public void fly() {
		System.out.println("bird flying");
		
	}
	
	public void buildNest() {
		System.out.println("bird build nest");
	}
	
	public void layEggs() {
		System.out.println("bird Lay Eggs");
	}
	
	public void eat() {
		System.out.println("bird eat");
	}
	
	
}
