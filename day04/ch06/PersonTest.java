package com.shinhan.day04.ch06;

public class PersonTest {
	
	 public static void main(String[] args) {
		//Person per1 = new Person(); //사람1
		//Person per2 = new Person(); //사람2
		
		Person per1 = new Person(29, "홍길동"); //사람1 정보
		Person per2 = new Person(); //사람2 정보
	
		per1.selfIntroduce();
		per2.selfIntroduce();
		
		System.out.println("인원수 " + Person.numberOfPerson);
	 }
}
