package com.shinhan.day05;

public class BookChild extends Book {
	
	BookChild() {
		
	}
//	Book(부모 클래스)에서 final로 해놨기 때문에 다시 정의할 수 없음
//	부모 클래스에서 final 빼고 void display()만 하면 가능함
	
//	final void display() {
//		System.out.println("재정의");
//	}
}
