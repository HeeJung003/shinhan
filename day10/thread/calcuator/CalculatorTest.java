package com.shinhan.day10.thread.calcuator;

public class CalculatorTest {
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	User1Thread u1 = new User1Thread();
	u1.setCalculator(calculator);
	
	User2Thread u2 = new User2Thread();
	u2.setCalculator(calculator);
	
	u1.start();
	u2.start();
}
}
