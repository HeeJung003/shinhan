package com.shinhan.day04.ch06;

//class: 설계도, template, object를 생성하기 위한 틀
//class = field+method
//public:모든 "패키지"에서 접근 가능
//class는 5가지 구성요소를 정의할 수 있다. 필수 X
public class Book {
	//1. field(변수, 특징)
	String title;
	String author;
	int price;
	
	//2. 생성자 (constructor) 메서드
	//생성자 정의가 없으면 컴파일타임에 자동으로 기본 생성자를 만듦

	Book() { //기본 생성자=argument가 없음, class 이름이랑 같아야 함. 
		//System.out.println("Book의 기본생성자");
		this(null, null, 0);
	}
	
	//생성자 오버로딩
	//이름은 같고 매개변수 사양(개수, 타입)이 여러개 정의 가능 
	//하나의 생성자가 같은 이름의 다른 생성자를 호출 : this()
	//생성자는 return X
	//매개변수가 작은 곳 -> 많은 곳을 호출? OK
	//매개변수가 많은 곳 -> 작은 곳을 호출? NO
	Book(String title, String author, int price) {
		//System.out.println("argument 3개");
		//생성자메서드를 만드는 목적: 값을 초기화하기 위해
				
		this.title = title;
		this.author = author;
		this.price = price;
		
		//매개변수이름과 fieldㅣ이름이 같아서 충돌됨 -> 구별 필요 
		//-> 객체 자신을 this라는 예약어로 접근
		//this는 이 class를 이용해서 만든 객체(실체)
		
		//title = title;
		//author = author;
		//price = price;
	}
	
	Book(String title, int price) {this(title, null, price);} //생성자 호출}
	Book(int price, String author) {this(null, author, price);}
	Book(int price) {this("미제", "미상", price);}
	
	//3. 일반 메서드
	void bookInfo() {
		System.out.println("**책 제목 : " + title);
		System.out.println("**책 제목 : " + author);
		System.out.println("**책 제목 : " + price);
	}
	//4. block
	
	
	//5. inner class

}
