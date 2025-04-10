package com.shinhan.day08;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		
		anony.field2.run();
		
		anony.method1();
		
		anony.method2(() -> System.out.println("람다식으로 파라미타 보내기"));
		anony.method2(new Vehicle() {
			public void run() {
				System.out.println("익명구현 class를 파라미타로보내기");
			}
		});
	}
}
