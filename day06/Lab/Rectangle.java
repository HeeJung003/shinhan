package com.shinhan.day06.Lab;

public class Rectangle extends Shape {
	int width;
	int height;

	public Rectangle(String color, int width, int height) {
		super(color, "Rectangle");
		this.width = width;
		this.height= height;
	}
	
	//어떤 모양인지에 따라 구하는 방법 다름
	@Override
	public double calculateArea() {
		return width * height;
	}
	
	//어떤 모양인지에 따라 구하는 방법 다름
	@Override
	public double calculatePerimeter() {
		return 2*(width+height);
	}
	
}
