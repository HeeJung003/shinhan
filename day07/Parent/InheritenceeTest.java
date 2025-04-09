package com.shinhan.day07.Parent;

public class InheritenceeTest {

	public static void main(String[] args) {
		f2();

	}

	private static void f5() {
		//자동형변환
		Parent v1 = new Child(99, "홍");
		
		//강제형변환
		//Child v2 = (Child)v1;
		//형제로 갈 수는 없음 -> 컴파일시 오류 X, 실행시 오류
		//Child2 v3 = (Child2)v1;
		
		//그래서 이러한 오류를 해결하기 위해
		//instanceof 사용
		//v1이 Child라면
		if(v1 instanceof Child) {
			Child v2 = (Child)v1;
			System.out.println(v2.myName);
		}
		
		//만약 v1이 Child2라면
		if(v1 instanceof Child2) {
			Child2 v3 = (Child2)v1;
		}
	}

	private static void f4(Parent p) {
		//자동형변환: 부모의 타입 = 자식의 객체
		//field: 타입을 따른다.
		System.out.println(p.score); //Parent만 가지고 있는 필드, 메소드만 가능
		//method는 instance를 따른다. -> 사용법은 같은데 결과는 다르게 (다형성)
		p.info();
	}

	private static void f3() {
		Child v1 = new Child(99, "홍");
		System.out.println("**");
		Child2 v2 = new Child2();
		
		f4(v1);
		System.out.println("************");
		f4(v2);
		
	}

	private static void f2() {
		Child child = new Child(100, "홍길동");
		child.score = 100;
		child.myName = "홍길동";
		//System.out.println(child.score);
		//System.out.println(child.myName);
		
		//메서드 호출은 instance를 따름
		child.info();
		child.display();

	}

	private static void f1() {
		// 자식을 new하면 부모도 new
		Child child = new Child();
		child.score = 100;
		System.out.println(child.score);
		child.info();

		Child2 child2 = new Child2();
		child2.score = 200;
		System.out.println(child2.score);
	}

}
