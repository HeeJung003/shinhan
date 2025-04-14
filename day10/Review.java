package com.shinhan.day10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Vehicle{
	private String company;
}

//규약서, 추상, 실제 구현X(자식이 구현할 것임)
interface Activeable{
	public abstract void active();
}


//제공하는 라이브러리
//럼북 어노테이션
@AllArgsConstructor
@Setter
@Getter

class Car extends Vehicle implements Activeable{
	//1. field (데이터 저장하는게 목적)
	private String model;
	int price;
	
	//2. constructor method (new방법)

	//3. 일반 method(기능)
	void test1() {
		setCompany("기아");
		System.out.println(getCompany());
	}

	@Override
	public void active() {
		try {
			int a = 10/0;
			System.out.println(a);
		}catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}

	}
	//4. block: {}, static{}
	//5. inner class: class{}, static class{}, local class => /method 안에() {class{}}
}

public class Review {

	public static void main(String[] args) {
		call();
		System.out.println("main 끝!");

	}

	private static void call() {
		Car car = new Car("ABC", 100); //car는 Car 타입임!! (int, string X)
		car.setModel("AAA");
		car.setCompany("현대");
		System.out.println(car.getCompany());
		
		car.active();

		System.out.println(car.getModel());
		
	}

}
