package com.shinhan.day10.thread.calcuator;

public class User1Thread extends Thread {
	Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread");
	}
	
	public void setCalculator(Calculator cal) {
		this.calculator = cal;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
}
