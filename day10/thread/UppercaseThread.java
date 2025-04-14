package com.shinhan.day10.thread;

public class UppercaseThread extends Thread{

	//run method 구현하면 다중 흐름을 가질 수 있음
	//run() 메서드를 재정의해야 함 (Thread 안에 run()있음)
		
	@Override
	public void run() {
		for(char ch = 'A';ch <='Z'; ch++) {
			System.out.print( ch);
		}
	}
	
	
}
