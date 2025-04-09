package com.shinhan.day04.ch06;

public class Person {
	//static: 모든 object 공유함
	static int numberOfPerson = 0;
	int age;
	String name;
	
	//생성자
	public Person() {
		this(12, "Anonymous"); //기본값
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPerson++;
	}
	 
	//매서드 : 반드시 return에 대한 정의 필요
	public void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는 " + age +"살 입니다.");
	}
	
	public static int getPopulation() {
		return numberOfPerson;
	}
}
