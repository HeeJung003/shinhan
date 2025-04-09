package com.shinhan.day05;

//java의 패키지
//
//window의 폴더 = unix의 디렉토리
//
//- 관련있는 클래스들의 묶음


public class FinalTest {
	
	//static 없음
	// -> instance 메소드: static, non-static 사용 가능
	public void display() {
		f2();
		System.out.println(getClass().getName());
	}

	//static method: 객체생성없이 사용 가능
	public static void main(String[] args) {
		f2();
		//System.out.println(getClass().getName()); 
		//오류 -> static은 메모리에 올라갔는데 getClass는 staitc 아님. 재정의 불가능
		//static은 static
		
		//FinalTest는 static이 아니니까 display를 사용할 수 없음 -> new 사용.
		new FinalTest().display(); //new하면 사용 가능
	}

	private static void f2() {
		//상수는 값 변경 불가
		//Math.PI = 3.14;
		System.out.println(Math.PI);
		
	}

	private static void f1() {
		Book b1 = new Book("자바다", 10000, "박작가");
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.author);
		System.out.println(b1.author2);
		
		b1.display();
		System.out.println(Book.PUBLISHER);
		
	}

}

