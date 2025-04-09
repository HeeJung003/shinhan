package com.shinhan.day07.Lab2;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	

	Rectangle(int numSides, int width, int height) {
		//super(numSides);
		this.height = height;
		this.width = width;
	}
	
	Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	double getArea(int width, int height) {	
		return width*height;
	}
	
	
	@Override
	double getArea() {
		return width*height;
	}

	@Override
	double getPerimeter() {
		return (width+height)*2;
	}

	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}
	
	
}
