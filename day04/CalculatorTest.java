package com.shinhan.day04;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		
		System.out.println(cal.add(1, 3));
		System.out.println(cal.add(1, 3, 5));
		System.out.println(cal.add("가", "나"));

	}
}
