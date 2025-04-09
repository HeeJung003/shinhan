package com.shinhan.day04;

public class Person {

	//1. field
	String name;
	
	//2.method
	void play() {
		
	}
	void eat() {
		
	}
	void use_calc() {
		//사용관계
		//class 타입 object변수 선언 = new로 생성
		Calculator cal = new Calculator();
		int result = cal.add(1,  2);
		System.out.println(result);
	}
	

}
