package com.shinhan.day04.ch06;

//Korean이라는 class를 이용해서 object들을 만들 예정. 설계도 만드는 중
public class Korean {
	//1. field (속성, 변수) -> 값을 저장하기 위한 목적
	String nation = "대한민국";
	String name;
	String ssn;
	
	//2. 생성자 메서드 -> 컴파일 시에 생성자 정의 없으면 (안 만들면) 자동으로 디폴트생성자 만들어줌
	Korean(){
		//생성자가 같은 이름의 다른 생성자를 호출
		//this("아무개", null); -> 안 쓰면 자동으로 null
	}
	Korean(String name, String ssn){
		//매개변수로 받은 값을 field에 초기화한다.
		//this 쓰는 이유: 매개변수와 field 이름이 충돌 -> 구분하기 위해 현재 객체를 this
		this.name = name;
		this.ssn = ssn;
	}
	//3. 일반메서드
	void display() {
		System.out.println("===한국사람정보===");
		System.out.println("이름 : " + name);
		System.out.println("ssn : " + ssn);
	}
	
	//4. block
	//5. inner class
	

}
