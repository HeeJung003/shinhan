package com.shinhan.day05;

public class ObjectTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("ABC");
		Car c3 = new Car("ABC", "black");
		Car c4 = new Car("ABC", "black", 2000);
		
		System.out.println(c1.toString()); //문자가 출력됨. object 상속에 의해 이렇게 물려받음
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
