package com.shinhan.day02;

//변수 + 메서드 = class
// cmd > java 클래스이름
//JVM이 Review class를 load함(메모리 올림) -> main이 시작됨 -> main 끝에서 종료
public class Review {

	public static void main(String[] args) {
		System.out.println("main시작");
		f1();
		System.out.println("main끝");

	}
	
	public static void f1() {
		//변수: 변하는 값을 저장하기 위한 "저장 장소 이름"
		//1. 변수선언 -- 저장하고자하는 데이터의 성격
			//정수: byte(1), short(2), char(2), int(4), long(8)
			//실수: float(4), double(8)
			//논리: boolean(1)
		
		//2. 변수초기화 (초기화하지 않으면 사용할 수 없음) -- 지역변수는 반드시 초기화 필요
		int v1 = 200;
		long v2 = 100;
		
		
		//3. 변수사용
		v1++;
		
		//자동형변환(큰방 = 작은방)
		v2 = v1;
				
		//강제형변환(작은방 = 큰방)
		v1 = (int)v2;
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println("f1시작");
		System.out.println("f1끝");
	}

}

