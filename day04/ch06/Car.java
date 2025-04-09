package com.shinhan.day04.ch06;

public class Car {
	//1. field (object들마다 가지는 멤버변수)
	String model;
	String color;
	int maxSpeed;
	
	//여기서 선언하면 object마다 가지는 멤버변수니까 의미없음
	//int carCount = 0;
	
	//이렇게 쓰면 공유해서 쓸 수 있는 변수가 됨
	//class를 이용해서 생성한 모든 instance(멤버)가 공유한다.
	static int carCount;
	
	//2. 생성자
	Car() {
	}
	
	Car(String model) {
		
	}
	
	Car(String model, String color) {
		this(model, color, 700);
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		carCount++;
	}
	//3. 메서드
	void display()  {
		System.out.println("차 모델 : " + model);
		System.out.println("차 색: " + color);
		System.out.println("차 스피드: " + maxSpeed);
		System.out.println("=====");
	}
}
