package com.shinhan.day10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//함수 안에 annotaion이 뭐머있는지 알고싶음
		// class 정보
		Class cls = PrintService.class;

		Method[] methodArr = cls.getDeclaredMethods();

		for (Method method : methodArr) {
			System.out.println("메서드 이름 : " + method.getName());
			PrintAnnotation acc = method.getAnnotation(PrintAnnotation.class);
			System.out.println(acc.value());
			System.out.println(acc.number());
			
			display(acc.value(), acc.number()); 
			
			//메서드 실행함 -> "실행" 출력됨
			method.invoke(new PrintService());

		}
	}
	
	private static void display(String value, int number) {
		for(int i = 1; i < number; i++) {
			System.out.print(value);
		}
	}
}
