package com.shinhan.day10.thread.safeStop;

import lombok.Setter;

@Setter
public class PrintThread extends Thread {
	private boolean stop;

	public void run() {
		while (!stop) {
			System.out.println("printThread2 - 실행중");
		}
		System.out.println("안정적으로 자원을 정리 > 파일닫기, 네트워크 끊기 등");
		System.out.println("printThread2 - 정상종료");
	}

}
