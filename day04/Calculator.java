package com.shinhan.day04;

public class Calculator {

	//1. field
	String company; //제작회사
	
	//2. method
	
	//정수 2개를 받아서 합계를 return 함
	int add(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	
	//근데 정수 3개 받고싶음
	//정수가 추가될 때마다 함수 이름을 다르게 해야 하는 불편함
	// 그러면 --> 함수의 overloading (함수이름은 같고 매개변수 사양이 다름)
	double add(int a, int b, int c) {
		return a+b+c;
	}
	
	// 그러면 --> 함수의 overloading (함수이름은 같고 매개변수 사양이 다름)
	String add(String a, String b) {
		return a + b;
	}
}
