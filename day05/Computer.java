package com.shinhan.day05;

/**
 * Modifier: 접근 권한 활용방법
 * 활용방법: static final
 * 
 * (field, constructor, method, class)에 줄 수 있음
 * 접근권한 4가지
 * public : 모든 패키지에서 접근 가능
 * protectd : 같은 패키지이면 접근가능, 패키지가 다르면 상속받으면 가능
 * 생략(default) : 같은 패키지에서 접근 가능
 * private : 자신의 클래스에서만 접근 가능
 */

public class Computer {
	int a;
	public static int b; //접근권한 O, 활용방법 O
	public static final int C=100; //접근권한 O, 활용방법 O
	
	
	public String os;
	public int price;
	
	//다른 패키지에서 new로 사용할 수 있도록 public
	public Computer() { }
	
	public Computer(String os, int price) {
		this.os = os;
		this.price = price;
	}
	
	public void print() {
		System.out.println(os);
		System.out.println(price);
	}
	
	void print2() {
		System.out.println(os);
		System.out.println(price);
	}
	
	protected void print3() {
		System.out.println(os);
		System.out.println(price);
	}
	
	private void print4() {
		System.out.println(os);
		System.out.println(price);
	}
	
}
