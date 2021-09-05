package com.fly;

public class Main  {

	public static void main(String args[])
	{
		Flyer myFlyer=null;
		System.out.println("**********************");
		myFlyer=new Superman();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		Superman mySuperman=new Superman();
		mySuperman.leapBuilding();
		mySuperman.stopBullets();
		mySuperman.eats();
		System.out.println("**********************");
		myFlyer=new Bird();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		Bird myBird=new Bird();
		myBird.eat();
		myBird.layEggs();
		myBird.buildNest();
		System.out.println("**********************");
		myFlyer=new AirPlane();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		System.out.println("**********************");
		myFlyer=new SeaPlane();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		System.out.println("**********************");
		myFlyer=new Helicopter();
		myFlyer.land();
		myFlyer.takeOff();
		myFlyer.fly();
		System.out.println("**********************");
		Animal myAnimal=new Animal();
		myAnimal.eats();
		System.out.println("**********************");
		Kryptonian myKryptonian=new Kryptonian();
		myKryptonian.eats();
	}
}