package com.shinhan.day11;

class MyThread1 extends Thread{
	public void run() {
		System.out.println(currentThread().getName()+ ": thread1");
	}
}

class MyThread2 extends Object implements Runnable{
	//thread 아님
	public void run() {
		System.out.println(Thread.currentThread().getName()+ ": thread2");
	}
}


public class Review {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+ "시작");
		
		MyThread1 t1 = new MyThread1();
		Runnable r1 = new MyThread2();
		Thread t2 = new Thread(r1);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+ "끝");
	}

}
