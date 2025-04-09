package com.shinhan.day07.inter;

//interface: 규격서, 상수 + 추상메서드들의 묶음
//interface는 함수 못 만들어 -> default static private
//실제 구현 X
//규칙만 정함
public interface TV {
//	1. 상수, public static final 생략 가능
	int SBS = 6;
	static final int KBS = 9;
	
//	2. 추상메서드, public abstract 생략 가능
	void powerOn();
	public abstract void powerOff();
	public abstract void show(); //나중에 추가하면 다 고쳐야 됨 -> default에서 당연한 기능을 넣음 (원래 함수 못 넣음. 버전 올라가면서 생김)
	
//	3. default 메서드
	//구현 클래스가 재정의(수정) 가능한 메소드가 됨
	//구현 클래스가 공통적으로 사용 가능한 기능
	//모든 자식들이 사용 가능
	default void active() {
		System.out.println("interface의 default 메서드 active()");
	}
	
//	4. static 메서드
	//구현 클래스가 재정의 불가
	//인터페이스이름.~
	static void staticMethod() {
		System.out.println("interface의 static 메서드 staticMethod()");
		privateStaticMethod();
	}
	
//	5. private 메서드
	private void privateMethod() {
		System.out.println("interface 내부에서만 사용되는 private 메서드");
	}
	
//	6. private static 메서드
	private static void privateStaticMethod() {
		System.out.println("interface의 내부에서만, static에서만 사용되는 메서드");
	}
}
