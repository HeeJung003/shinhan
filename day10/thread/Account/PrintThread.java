package com.shinhan.day10.thread.Account;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintThread extends Thread {
	ShareArea shareArea;

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			// 방법 1 : shareArea에 메소드 만들고 호출
			shareArea.print();

			// 방법 2 : 동기화
			synchronized (shareArea) {
				int a = shareArea.getSung().getBalance();
				int b = shareArea.getLee().getBalance();

				System.out.println("잔액 합계 : " + (a + b));
			}
		}
	}

}
