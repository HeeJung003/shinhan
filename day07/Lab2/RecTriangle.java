package com.shinhan.day07.Lab2;

public class RecTriangle extends Shape {
	
	double width;
	double height;

	RecTriangle(int width, int height) {
		//super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		return width+height+Math.sqrt(width*width + height*height);
	}


}
