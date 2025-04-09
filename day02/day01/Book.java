package com.shinhan.day01;

//>java Book
//JVM이 class를 load하고 main 시작
//클래스명 = 소스파일명 = class Book = Book.java
public class Book {

	public static void main(String[] args) {
		System.out.println("Book class의 main method");
		f1();
		System.out.println("--main end--");
		
		new Cup().f1();

	}

	private static void f1() {
		System.out.println("Book class의 f1 method");
		
	}

}

//하나의 .java 안에 여러개의 class를 만들 수 있음
//public 클래스는 반드시 자신의 이름으로 저장해야 함. public은 선택
//하나의 class(Book class)가 다른 class(Cup class)를 사용하려면 반드시 "생성"(Cup을 만들어야) 후 사용

//한 줄 주석 ctrl /
//여러 줄의 주석 ctrl + shift + /

class Cup{
	public void f1() {
		System.out.println("Cup class의 f1 method");
		
	}
	
}
