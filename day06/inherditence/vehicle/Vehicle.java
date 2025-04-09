package com.shinhan.day06.inherditence.vehicle;

//final class는 상속 불가
//final field는 수정 불가
//final method는 재정의불가

public class Vehicle {

	String name;
	int speed;
	
	final int score = 99;
	
	public Vehicle() {}
	
	protected Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void start() {
		System.out.printf("%s가 출발합니다. (속도 : %dkm/h)\n",name, speed);
	}
	
	public void stop() {
		System.out.println(name + "가 멈춥니다.");
	}
	
	public void info() {
		System.out.printf("차량명 : %s , 최고속도 : %d\n", name, speed);
	}
}
