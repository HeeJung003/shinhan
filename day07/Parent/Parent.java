package com.shinhan.day07.Parent;

public class Parent {
	//1. feild
		int score;
	
	//2.constructor..default생성자는 정의없을때만 컴파일시 만들어짐
	
	Parent() {
		System.out.println("Parnet의 default 생성자");
	}
	
	Parent(int score) {
		this.score = score;
		System.out.println("Parnet의 socre 생성자");
	}
	
	//3. method
	void info() {
		System.out.println("부모의 info 메소드 : score ="  + score);
	}
}
