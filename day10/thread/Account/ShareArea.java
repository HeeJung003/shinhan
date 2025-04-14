package com.shinhan.day10.thread.Account;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class ShareArea {
	private Account sung;
	private Account lee;
	
	//이 함수를 점유하고 있는 thread가 있다면
	//다른 thread는 진입하지 않고 기다리기
	public synchronized void print() {
		int a = sung.getBalance(); 
		int b = lee.getBalance();
		
		System.out.println("잔액 합계 : " + (a+b));
	}
}
