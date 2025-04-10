package com.shinhan.day08;

//익명구현class를 field, localVar, method로 넘기기
public class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("익명 구현으로  class 를 구현함(field 사용)");
		}
	};
	
	Vehicle field2 = () -> System.out.println("람다 표현식으로 class 를 구현함(field 사용)");
	
	void method1() {
		Vehicle localVar = () -> System.out.println("람다 표현식으로 구현함(localVar 사용)");;
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
