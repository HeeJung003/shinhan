package com.shinhan.day06.Exercise;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); //스노우
		tire.run();
	}
}

