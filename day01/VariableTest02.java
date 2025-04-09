package com.shinhan.day01;

//class: 변수+메서드
//1~5만 쓸 수 있음
public class VariableTest02 {
	
	//1. field(멤버변수)
	int score = 99;
	//System.out.println(v1); -> 오류 -> 문장은 함수 안에서만 작성

	//2. 생성자메서드
	//3. 일반메서드(기능)
	public static void main(String[] args) {
		//method6("10", "20"); //숫자형 문자
		method8();

	}

	private static void method8() {
		//기본형인데 문자열로 바꾸고 싶음
		int v1 = 100;
		String s1 = v1 + "";
		System.out.println(s1 + 200);
		String s2 = String.valueOf(v1);
		System.out.println(s2);
	}

	private static void method7() {
		//문자열을 기본형으로 바꾸고 싶음 
		//wrapper class = 기본형타입 + 기능
		String s1 = "100";
		byte v1 = Byte.parseByte(s1);
		
		//잘못된 casting -> 기본형만 casting 가능. s1은 문자열
		//byte v11 = (byte)s1;
		
		short v2 = Short.parseShort(s1);
		int v3 = Integer.parseInt(s1);
		long v4 = Long.parseLong(s1);
		float v5 = Float.parseFloat(s1);
		double v6 = Double.parseDouble(s1);
		s1 = "aaa";
		boolean v7 = Boolean.parseBoolean(s1); //true일 때만 true
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
		
	}

	//파라메터, argument
	private static void method6(String s1, String s2) {
		//문자를 숫자로 변경해야 됨
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		System.out.println("덧셈: " + (a+b)); //문자 + 숫자 = 문자 -> 연산자 우선순위하기 위해 연산자에 ( )
		System.out.println("뺼셈: " + (a-b)); //문자 - 숫자 = 불가 -> ..
		System.out.println("곱셈: " + a*b); //더하기보다 곱하기가 우선사 우선순위이기 때문에 ( ) 필요없음
		System.out.println(a/b);
		System.out.println(a%b);
		
	}

	private static void method5() {
		//두 수의 차식연상 수행하기
		int a = 10;
		int b = 3;
		System.out.println("덧셈: " + (a+b)); //문자 + 숫자 = 문자 -> 연산자 우선순위하기 위해 연산자에 ( )
		System.out.println("뺼셈: " + (a-b)); //문자 - 숫자 = 불가 -> ..
		System.out.println("곱셈: " + a*b); //더하기보다 곱하기가 우선사 우선순위이기 때문에 ( ) 필요없음
		System.out.println(a/b);
		System.out.println(a%b);
		
	}

	private static void method4() {
		//연산식에서 정수는 int로 자동 형변환된다.
		byte v1 = 10;
		byte v2 = 20;
		int v3 = v1+v2;
		byte v4 = (byte)(v1+v2);
		
		System.out.println(v3);
		System.out.println(v4);
	}

	private static void method3() {
		int v1;
		byte v2 = 100;
		float v3;
		//v2를 v1에 담아야 할 때
		//타입이 다를 때 자동타입변환되는 경우, 강제로 타입이 변환되는 경우
		//**자동 타입변환: 값이 작은데 큰 방일 때, 큰방 = 작은방
		v1 = v2;
		System.out.println(v1);
		v3 = v2;
		System.out.println(v1);
		System.out.println(v3);
		//**강제 타입변환: 값이 큰데 작은 방일 때, 작은방 = (작은방타입) 큰방 -> 데이터 손실 가능성있음!!!
		//byte < short, char < int < long < float < double
		
		v1 = 99;
		v2 = (byte)v1;
		System.out.println(v2);
		
		char ch = 'A';
		v1 = ch; //v1: 4byte, ch:2byte
		ch = (char)v1;
		System.out.println(ch);
		
	}

	private static void method2() {
		// """쓰고 { 내용 } """
		// json 사용
		String v2 = """
				{
				"name": "hong",
				 "age": 20,
				 "major": "computer"
				 }
				""";
		System.out.println(v2);
	    		
	}

	private static void method1() {
		//문자열 
		String v1 = "이것이\t\t \"자바\"다.";
		//String v1 = '이것이 자바다'; 오류 -> 자바는 ""
		//함수 안에 문장은 가능
		System.out.println(v1);
	}

		//4. inner class
		//5. block(문장들의 묶음)
}
