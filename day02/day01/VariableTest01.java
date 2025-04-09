package com.shinhan.day01;

//자바의 기본형타입 기능) 데이터 저장, 연산 가능, 값 비교 가능
//wrapper class: 자바의 기본형타입 + 기능
/*
 * 기본형타입 = wrapper class
 * byte = Byte
 * short = Short
 * char = Character
 * int = Integer
 * long = Long
 * float = Float
 * double = Double 
 * boolean = Boolean
 */

public class VariableTest01 {

	public static void main(String[] args) {
		f7();
	}
	
	private static void f7() {
		boolean v1 = true;
		boolean v2 = false;
		
		int score = 100;
		
		boolean v4 = score >= 90;
		
		//&&: 앞에 결과가 맞으면 뒤에 문장 수행
		//&&: 앞에 결과가 틀리면 뒤에 문장 수행 X
		//&&: 단축구문, 둘 다 참이어야 참
		boolean v5 = score >=90 && ++score <=100;
		
		System.out.println(score);
		System.out.println(v4);
		System.out.println(v5);
		
		//||: 하나라도 참이면 참
		//||: 앞에 결과가 맞으면 뒤에 문장 수행 X
		//||: 단축구문, 앞에 결과가 틀리면 뒤에 문장 수행
		boolean v6 = score >=90 || ++score <=100;
		System.out.println(v6);
		
	}

	private static void f6() {
		//실수값의 기본은 double
		double v1 = 3.14;
		float v2 = 3.14f;
		
		System.out.println(v1);
		System.out.println(v2);
	}
	
	private static void f5() {
		//자바의 리터럴값은 기본이 int 
		//L, l 대소문자 무관
		long v1 = 2147583648L; //L을 안 쓰면 int로 인식해서 L,l 써야 됨
	}

	private static void f4() {
		int v1 = 2147483647; //4byte => 4GB 저장 가능, 가장 많이 사용하는 타입
		int v2 = Integer.MAX_VALUE; //wrapper class를 사용했기 때문에 max_value 기능을 통해 알 수 있음
		
		System.out.println(v1);
		System.out.println(Integer.bitCount(v2)); // 1이 몇 개 있는지 알 수 있음 -> 기능이 들어있어서 알 수 있음
		
	}

	private static void f3() {
		//char는 단일문자 '' 만 가능
		char v1 = 'A'; //아스키코드로 65 출력
		char v2 = '가';
		char v3 = 65; //A
		char v4 = 0x0041; //16*4 + 1*1 = 65 = A
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}

	private static void f2() {
		short v1 = 32767;
		v1++;
		System.out.println(v1);
		//넘으면 작은 값으로 넘어감
		
	}

	private static void f1() {
		//변수: 변할 수 있음. 값을 저장하기 위한 "저장공간 이름"
		//변수타입 변수이름
		//변수타입: 데이터의 성격 (기본형 데이터타입: 정수, 실수, 논리값 -> 총 8가지)
		//정수: byte , short, "char", int , long
		//실수: float, double
		//논리: boolean
		//나머지는 다 객체
		
		//1. 변수선언(함수 내에 있는 변수는 지역변수, 지역변수는 반드시 "초기화" 후 사용)
		//초기화없이 사용하면 컴파일 에러
		byte v1;
		//2. 값 할당
		v1 = 10;
		//1+2. 선언과 할당 동시에
		byte v2 = -128;
		//3. 값 사용
		System.out.println(v1);
		System.out.println(v2);
		
		//byte는 127까지 들어갈 수 있으므로 128 넘으면 작은 값으로 넘어감
	}
}
