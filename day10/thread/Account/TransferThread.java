package com.shinhan.day10.thread.Account;

import lombok.AllArgsConstructor;

@AllArgsConstructor
//이체. 12번하는 thread 만듦
public class TransferThread extends Thread {

	ShareArea shareArea;
	
	
	@Override
	public void run() {
		//12번 sung -> lee 100만원씩 이체
		for(int i = 1; i <= 12; i++) {
			
			synchronized (shareArea) {
				int amount = shareArea.getLee().withdraw(100);
				System.out.println("출금(lee -> sung) : " + amount);
				
				shareArea.getSung().deposit(amount);
				System.out.println("입금(sung) : " + amount);
				System.out.println("----------------");
			}
			
		
		}
	}
	
}
