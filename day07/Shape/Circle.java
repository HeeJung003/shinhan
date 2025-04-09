package com.shinhan.day07.Shape;

public class Circle extends Shape {
	int radius;
	
	Circle() {}
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
}
