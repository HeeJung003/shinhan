package com.shinhan.day07.Shape;

//abstract class : abstract메서드가 0개 이상 있다.
public abstract class Shape {
	 //면접구하기
	 // Circle이 들어올지 Rectangle이 들어올지 모름
	 //부모를 통해 자식의 기능을 구현하기 위해 정의
	 //껍데기는 만들고 알맹이는 자식클래스에서
	 //정의 O, 구현({}) X => 추상 method
	
	public abstract double getArea();
	
	void f1() {
		System.out.println("일반 메소드");
	}
	
}
