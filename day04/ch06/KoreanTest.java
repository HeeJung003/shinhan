package com.shinhan.day04.ch06;

public class KoreanTest {

	public static void main(String[] args) {
		//1. 배열참조변수선언
		Korean[] arr = new Korean[5];
		
		//2. 객체 생성
		arr[0] = new Korean();
		arr[1] = new Korean("홍길동", "00");
		arr[2] = new Korean();
		arr[3] = new Korean();
		arr[4] = new Korean();
		
		//3. 객체 사용
		for(Korean kor :arr) {
			kor.display();
		}
		

	}

}
