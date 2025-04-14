package com.shinhan.day10.thread.Account;

public class PrintThreadTest {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		Account sung = new Account("123", "성", 1000);
		Account lee = new Account("123", "이", 2000);
		ShareArea shareArea = new ShareArea(sung, lee);

		PrintThread t1 = new PrintThread(shareArea);
		TransferThread t2 = new TransferThread(shareArea);
		
		t1.start();
		t2.start();
	}

}
