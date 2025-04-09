package com.shinhan.day04.ch06;

public class BookTest {
	
	public static void f4(String[] args) {
		String s1= "자바";
		String s2 = new String("자바");
		
		char[] arr = {'A', 'B', 'C', '자', '바'};
		String s3 = new String(arr);
		System.out.println(s3);
	}
	
	public static void main(String[] args) {
		//선언+생성

		Book[] arr = new Book[5];
		
		arr[0] = new Book("SQL배우기", "홍길동", 20000);
		arr[1] = new Book("Web", 20000);
		arr[2] = new Book(5000, "커피");
		arr[3] = new Book(7000);
		arr[4] = new Book();
		
		arr[4].title = "이것이 자바다";
		arr[4].author ="신용권";
		arr[4].price = 38000;
		
		for(Book b:arr) {
			//print(b);
			b.bookInfo();
		}
	}
		

	//좋은 방법 아님 -> 일반 메서드로 만들어서 안에서 실행
	private static void print(Book b1) {
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		System.out.println("==========");
		
	}

	public static void f1(String[] args) {
		//기본형변수
		int i = 0;
		
		//1. 객체참조변수선언
		Book b1;
		
		//2. 객체생성 -> field가 자동초기화됨
		b1 = new Book();
		
		//3. 객체사용
		System.out.println(b1.title);
		System.out.println(b1.author);
		System.out.println(b1.price);
		System.out.println("지역변수는 반드시 초기화 " + i);
		
		
	}

}
