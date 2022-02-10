package com.samhein.zookeeper;

public class Bat extends Mammal {
	
	// constructor
	public Bat() {
		super();
		super.energyLevel = 300;		
	}
	
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Wooooosh bat takeoff");
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Crackle crackle town on fire");
	}
	
}
