package com.shinhan.day07.Shape;

public class Rectangle extends Shape{
	int width, height;
	
	public Rectangle() {}
	
	Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return width*height;
	}
}
