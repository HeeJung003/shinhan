package com.shinhan.day04.ch06;

public class CarTest {

	public static void main(String[] args) {
		// Car 3개를 만들어가
		Car[] car = new Car[3];
		
		car[0] = new Car("차1", "yellow");
		car[1] = new Car("차2", "blue");
		car[2] = new Car("차3", "red", 500);
		
		for(Car c :car) {
			c.display();
		}
		System.out.println("CarCount : " + Car.carCount);

	}

}
