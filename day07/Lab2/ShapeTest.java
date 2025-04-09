package com.shinhan.day07.Lab2;

public class ShapeTest {

	public static void main(String[] args) {
		//Rectangle r1 = new Rectangle(5, 6);
		//RecTriangle rt = new RecTriangle(6, 2);
		
		Shape arr[] = new Shape[2];
		arr[0] = new Rectangle(5, 6);
		arr[1] = new RecTriangle(6, 2);
		
		for(Shape shape : arr) {
			System.out.println("area : " + shape.getArea());
			System.out.println("perimeter : " + shape.getPerimeter());
			
			if(shape instanceof Resizable resize) {
				resize.resize(0.5);
				System.out.println("new area : " + shape.getArea());
				System.out.println("new perimeter : " + shape.getPerimeter());
			}
		}
		
		
	}

}
