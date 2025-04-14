package com.shinhan.day10.thread.safeStop;

public class SafeStop2 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2();
		t1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.interrupt();
		
	}
}
