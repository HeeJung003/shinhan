package com.shinhan.day04.ch06;

public class OverloadingTest {

	public static void main(String[] args) {
		//f1(10);
		f1("java");
		f1(10, "java", 10.3, true);
		
		System.out.println(sum(1, 2, 3));

	}

	private static int sum(int...arr) { //가변길이 매개변수
		int result = 0;
		for(int su:arr) {
			result += su;
		}
		return result;
	}

//	private static int sum(int i, int j, int k) {
//		
//		return i+j+k;
//	}

	//함수 오버로딩
	//1. 함수이름 같음
	//2. 매개변수 개수와 타입이 다름
	//3. return이 같을수도 다를수도
	private static void f1(String string) {
		// TODO Auto-generated method stub
		
	}

	private static int f1(int i, String string, double d, boolean b) {
		// TODO Auto-generated method stub
		return 100;
	}

}
