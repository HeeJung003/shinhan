package com.shinhan.day01;

//class: 자바프로그램은 class들로 만들어진다.
//변수 + 메소드
public class Car {
//안에서는 이것만 쓸 수 있음
	
//1. field (변수, 속성, 특징)
	String model;
	int price;
	
//2. 생성자
	//class랑 이름 같음
	Car() {
		System.out.println("4. Car의 기본생성자");
	}
	
//3. 일반method
	void go() {
		System.out.println(model + "자동차가 간다.");
	}
	
//4. block
	{
		System.out.println("3. Car가 생성될 때마다 실행됨");
	}
	
	static {
		System.out.println("1. Car가 메모리에 올라올 때 1번 실행됨");
	}
	
//5. inner class
	class CarHandle{ //Car class 안에 부품느낌
		
	}
	
	public static void main(String[] args) {
		System.out.println("2. Car의 main 시작");
		
		Car c1 = new Car(); //객체 생성
		Car c2 = new Car(); 
		
		c1.model="제네시스";
		c2.model="그랜저";
		
		c1.go();
		c2.go();
		
	}
}


