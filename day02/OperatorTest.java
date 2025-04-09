package com.shinhan.day02;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		//call3(10,2.0);
		call8();

	}

	private static void call8() {
		//연산자 우선수위
		//산술 -> 비교 -> 논리(&& -> ||) -> 대입
		int a = 100;
		int b = 200;
		boolean v1 = 10 + 20 - 30 > 100 || ++a > b;
		System.out.println(v1);
		System.out.println(a);
		
		
		
	}

	private static void call7() {
		int v1 = 10;
		//3항연산자
		String result = v1%2 == 0? "짝수":"홀수";
		System.out.println(result);
		
		//조건문
		String result2;
		if(v1%2==0) {
			result2 = "짝수";
		}else {
			result2 = "홀수";
		}
		
		System.out.println(result2);
		
	}

	private static void call6() {
		int v1 = 10; 
		int v2 = 7;
		System.out.printf("%4s \n", Integer.toBinaryString(v1));
		System.out.printf("%4s \n", Integer.toBinaryString(v2));
		System.out.println(v1&v2); //1010&0111 = 0010 = 2
		
		System.out.println(v1 >> 2); //오른쪽으로 2개 갔어
	}

	private static void call5() {
		int v1 = 100;
		int v2 = 100;
		
		System.out.println(v1<100 && ++v2 >=100);
		//v1<100에서 틀렸으니까 뒤에는 수행 X -> v2 증가 X
		System.out.println(v2); 
	}

	private static void call4() {
		int v1 = 100;
		int v2 = 100;
		
		System.out.println(v1 == v2); //값 비교
		
		//String은 고정 문자열 -> 변경 불가
		String s1 = "java";
		String s2 = "java";
		//System.out.println(s1 == s2); //주소 같음 -> true
		
		String s3 = "java";
		String s4 = "java";
		s3 += "프로그램";
		s4 += "프로그램";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s3 == s4); //주소 달라짐 -> false
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println(sc1 == sc2); //주소 비교
		System.out.println(sc1.equals(sc2)); //내용 비교
		
		//==: 기본형은 값을 비교, 기본형이 아니면 주소비교
		
	}

	private static void call3(int v1, double v2) {

		System.out.println(v1/v2); //Infinity -> 실수0.0으로 나누면 무한대 -> 오류는 아님
		System.out.println(v1%v2); //NaN -> 실수 0.0으로 나눈 몫은 NaN
		
		//조건문으로 연산가능한지 체크
		if(Double.isInfinite(v1/v2)) {
			System.out.println("0.0으로 나누면 무한대");
		}else {
			System.out.println(v1/v2);
		}
		
		if(Double.isNaN(v1%v2)) {
			System.out.println("몫은 숫자가 아니야");
		}else {
			System.out.println(v1%v2);
		}
		
	}

	private static void call2() {
		int v1 = 10;
		int v2 = 0;
		
		System.out.println(v1/v2); //정수는 0으로 나눌 수 없음 -> Exception 발생
		
	}

	private static void call() { //private이니까 OperatorTest 안에서만 쓸 수 있음
		int data = 10;
		System.out.println(++data); //전위연산자: 증가하고 출력 11
		System.out.println(data++); //후위연산자: 출력하고 증가 11
		
		int data2 = 4;
		System.out.println(--data2); //전위연산자: 감소하고 출력 
		System.out.println(data2--); //후위연산자: 출력하고 감소
	}

}
