package com.shinhan.day10.thread.safeStop;

public class SafeStop {
	public static void main(String[] args) {
		PrintThread p1 = new PrintThread();
		p1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// p1.stop(); //안정적이지 않음 -> 사용하지 않기
		p1.setStop(true);
	}
}
