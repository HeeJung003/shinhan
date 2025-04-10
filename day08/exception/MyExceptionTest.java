package com.shinhan.day08.exception;

import java.io.IOException;

public class MyExceptionTest {

	public static void main(String[] args) throws IOException {
		f4();
	}

	private static void f4() throws IOException {
		//일반예외는 exception 해결할 의무가 있음
		//해결 안 하면 컴파일오류
		//해결방법1) 떠넘기기 throws (나의 함수를 부른 곳으로) -> 처리만 해줌
		//해결방법2) 내가 처리한다.
		
		int i = System.in.read();
		System.out.println(i);
	}

	private static void f3() {
		String score = "100점";
		
		try {
			int intscore = Integer.parseInt(score);
		}catch(NumberFormatException zz) {
			System.out.println(zz.getMessage());
			//zz.printStackTrace();
		}
		
		System.out.println("f3 end");
	}

	private static void f2() {
		try {
			int[] arr = new int[5];
		}catch(ArrayIndexOutOfBoundsException zz){
			System.out.println(zz.getMessage());
		}catch(NullPointerException zz) {
			System.out.println(zz.getMessage());
		}
		System.out.println("end");
	}


	//exception(예외)가 발생하면 프로그램 중단됨. 예외를 처리하면 계속진행하도록 할 수 있음 
	//1. RuntimeException .. 컴파일시 오류처리 안 함, 실행시 처리 -> ArithmeticException
	//2. 일반예외
	private static void f1() {
		//int b = 10/0; //에러 -> 프로그램 중지
		try {
			//예외 발생 가능성 있는 문장 작성
			int a = 10/2; //컴파일타임에는 에러 X, 실행할 때 에러 O
			System.out.println(a);
		}catch(ArithmeticException e){
			//예외 처리함
			System.out.println(e.getMessage());
		}
		System.out.println("===end===");
		
	}

}
