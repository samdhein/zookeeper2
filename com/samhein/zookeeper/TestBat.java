package com.samhein.zookeeper;

public class TestBat {

	public static void main(String[] args) {
		Bat b1 = new Bat();
		
		b1.attackTown();
		b1.attackTown();
		b1.attackTown();
		
		b1.eatHumans();
		b1.eatHumans();
		
		b1.fly();
		b1.fly();
		
		System.out.println(b1.energyLevel);

	}

}
