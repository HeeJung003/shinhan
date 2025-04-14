package com.shinhan.day10.thread.calcuator;

public class User2Thread  extends Thread{
	Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
		
	}
	
	public void setCalculator(Calculator cal) {
		this.calculator = cal;
	}
	
	public void run() {
		calculator.setMemory(50);
	}

}