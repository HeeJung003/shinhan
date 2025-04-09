package com.shinhan.day07.Shape;

public class ShpaeTest {

	public static void main(String[] args) {
		call();
	}
	
	private static void call2(Shape shape) {
		//둘 다 받을 수 있음
		double area = shape.getArea();
		System.out.println(shape.getClass().getSimpleName() + "면적 : " + area);
		shape.f1();
	}

	private static void call() {
		Circle c1 = new Circle(3);
		Rectangle r1 = new Rectangle(10, 20);
		
		call2(c1);
		call2(r1);
		
		//추상클래스는 instance를 만들 수 없음
		// Shape s = new Shape() X
	}

}
