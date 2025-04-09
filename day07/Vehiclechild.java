package com.shinhan.day07;

import com.shinhan.day06.inherditence.vehicle.Vehicle;

public class Vehiclechild extends Vehicle {
	Vehiclechild() {
		super("", 0);
	
	}
	void method1() {
		start(); //Vehicle에서 protected니까. Vehicle를 상속받았으니까 사용할 수 있음
		
	}
}
