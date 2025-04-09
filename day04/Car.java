package com.shinhan.day04;

//Object = class를 이용해서 만든 독립된 개체 (속성이 다른 object와 구별됨) -> 특징과 행위 정의
//class: object를 만들기 위한 틀 = template, 설계도 느낌
//instance: class를 이용해서 만든 object 실체 = object

//상속 관계에 있다. extend, car는 기계를 상속한다.
//독립하게 만들고 조립해서 사용함 -> 객체지향프로그램 =
public class Car extends 기계{

	//1. field(특징, 변수)
	String model;
	String color;
	int price;
	
	Engine a;
	Tire b;
	Handle c;

}
