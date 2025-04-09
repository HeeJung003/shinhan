package com.shinhan.day06.inherditence;

public class Parent {
	String name;
	int age;
	
	//생성자
	Parent() {
		System.out.println("부모의 default 생성자");
	}
	
	Parent(String name, int age) {
		System.out.println("부모의 arg2개 생성자");
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);
		
	}
}
