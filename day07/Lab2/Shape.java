package com.shinhan.day07.Lab2;

public abstract class Shape {
	int numSides; //변의 수
	
	Shape() {}
	
//	Shape(int numSides) {
//		this.numSides = numSides;
//	}
		
	public int getNumSides() {
		return numSides;
	}

	abstract double getArea(); //넓이
	
	abstract double getPerimeter(); //둘레 길이
}
