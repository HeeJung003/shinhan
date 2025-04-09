package com.shinhan.day06.inherditence.vehicle;

public class Bus extends Vehicle {
	int passengerCount;

	public Bus(String name, int speed, int passengerCount) {
		super(name, speed);
		this.passengerCount = passengerCount;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("승객 수용 가능 인원 : " + passengerCount +  "명");
		start();
		stop();
		System.out.println("=============");
	}
	
	public void info2() {
		System.out.println("버스!!!");
	}
}
