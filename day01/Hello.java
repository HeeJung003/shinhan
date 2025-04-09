package com.shinhan.day01;

//class: 자바프로그램
//함수: 문장들의 묶음
//main함수: 프로그램 시작 지점
//jvm은 main함수만 실행함
//main이 아닌 다른 함수 실행은  반드시 호출해야 한다.
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		f1(); //함수호출 : 수행 후 돌아옴
		f2();
		System.out.println("--main end--");
		

	}
	//함수정의
	public static void f1() {
		System.out.println("f1 시작");
		System.out.println("f1 종료");
	}
	
	//줄맞추기(formatting): ctrl + shift + f
	//함수정의
	public static void f2() {
		System.out.println("f2 시작");
		System.out.println("f2 종료");
	}


}


