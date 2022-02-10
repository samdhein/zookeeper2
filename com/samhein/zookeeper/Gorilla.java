package com.samhein.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something.");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Gorilla likes delicious bananas.");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree.");
		this.energyLevel -= 10;
	}
	
}
