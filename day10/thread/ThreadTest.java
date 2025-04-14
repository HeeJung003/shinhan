package com.shinhan.day10.thread;

//thread :프로그램의 실행 흐름
//단일 thread : 순서대로 흘러감
//muti thread
//기본은 단일 thread
public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("main 시작 -- thread 이름 : " + Thread.currentThread().getName());

		// thread 실행
		UppercaseThread t1 = new UppercaseThread();
		LowercaseThread t2 = new LowercaseThread();
		NumberRunnableClass r1 = new NumberRunnableClass(); // Thread 아님
		Thread t3 = new Thread(r1); // 그래서 Thread 만들어야 할 수 있음

		// 익명 구현 클래스
		(new Thread() {
			@Override
			public void run() {
				String arr[] = { "사과", "배", "딸기", "수박", "참외", "체리" };

				for (String s : arr) {
					System.out.print(s);
				}
			}
		}).start();

		// 익명 구현 클래스
		Thread t5 = new Thread(new Runnable() {
			@Override
			public void run() {
				String arr[] = { "사과**", "배**", "딸기**", "수박**", "참외**", "체리**" };

				for (String s : arr) {
					System.out.print(s);
				}
			}
		});
		t5.start();
		
		//람다표현식
		Thread t6 = new Thread(()->{
			String arr[] = { "사과6", "배6", "딸기6", "수박6", "참외6", "체리" };
			for (String s : arr) {
				System.out.print(s);
			}
		});
		t6.start();
		

		t1.start();
		t2.start();
		t3.start();

		// t1.run() //t1 다 찍고 t2로 넘어감 -> thread 아님

		System.out.println("main 종료");
	}
}
