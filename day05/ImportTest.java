package com.shinhan.day05;

//같은 이름은 import 하나만 할 수 있음

import java.util.Date;

//1. 현재 패키지에서 class를 찾음
//2. import되어있는 class를 찾음
//3. import된 class가 아니라면 패키지 이름과 class이름을 full로 작성

public class ImportTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		//import된 class가 아니라면 패키지 이름과 class이름을 full로 작성
		//deprecated since version 1.2 -> 권장하지 않음. 다른 방법을 사용하라는 의미
		java.sql.Date d2 = new java.sql.Date(2025-1900,4-1,7);
		System.out.println(d2);
		
		java.sql.Date d3 = new java.sql.Date(d1.getTime());
		System.out.println(d3);
		
		com.shinhan.day05.Date d4 = new com.shinhan.day05.Date();
		System.out.println(d4);//주소만 찍힘
	}

}
