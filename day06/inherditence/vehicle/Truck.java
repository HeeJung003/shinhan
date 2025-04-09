package com.shinhan.day06.inherditence.vehicle;

public class Truck extends Vehicle {
	int maxLoad;
	
	//Truck() {}
	
	public Truck(String name, int speed, int maxLoad) {
		super(name, speed);
		this.maxLoad = maxLoad;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("최대 적재량 : " + maxLoad + "kg");
		start();
		stop();
		System.out.println("=============");
	}
}
