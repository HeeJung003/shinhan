package com.shinhan.day06.Lab;

public class Circle extends Shape {
	double radius;
	double circumference;
	
	Circle() {}
	
	public Circle(String color, int radius) {
		super(color, "Circle");
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	//어떤 모양인지에 따라 구하는 방법 다름
	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double calculatePerimeter() {
		circumference = 2*Math.PI*radius;
		return circumference;
	}
	
	
}
