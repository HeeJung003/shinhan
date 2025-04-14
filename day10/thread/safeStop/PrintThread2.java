package com.shinhan.day10.thread.safeStop;


public class PrintThread2 extends Thread {

	public PrintThread2() {
		setName("ThreadThreadThread");
	}
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName() + "- 실행중");
				sleep(1);
			}
		}catch(InterruptedException e) {
			//System.out.println(e.getMessage());
		}
		System.out.println("안정적으로 자원을 정리 > 파일닫기, 네트워크 끊기 등");
		System.out.println("printThread2 - 정상종료");
	}
}
