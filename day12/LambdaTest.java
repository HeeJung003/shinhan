package com.shinhan.day12;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;

interface Calculable {
	public double calc(double x, double y);
}

class Person {
	double action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		return result;
	}
}

class Computer {
	static double staticMethod(double x, double y) {
		return x + y;
	}

	double instanceMethod(double x, double y) {
		return x * y;
	}
}

@AllArgsConstructor
class Student {
	String name;
	int age;
}

interface Creatable {
	Student make(String name, int age);
}

//interface Consumer{
//	void accept(Object o);
//}

public class LambdaTest {
	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		// 객체를 파라메타로 넘기고 이것을 사용하는 람다표현식을 만듦
		// 미리 정의되어서 제공해줌
		// 입력받는데 출력은 없음
		Consumer<String> a = (s) -> {
			System.out.println(s);
		};
		BiConsumer<String, Integer> b = (s, i) -> {

		};
	}

	private static void f5() {
		Creatable f1 = (name, age) -> new Student(name, age);
		Student st = f1.make("홍길동", 20);
		System.out.println(st);

		Creatable f2 = Student::new; // Creatable f1 = (name, age) -> new Student(name, age);랑 같음
		Student st2 = f2.make("김", 30);
		System.out.println(st2);
	}

	private static void f4() {
		Person p1 = new Person();
		Calculable cal1 = (x, y) -> x + y + 1000;
		double result1 = p1.action(cal1);
		System.out.println("result1 : " + result1);

		double result2 = p1.action(Computer::staticMethod);
		System.out.println("result2 : " + result2);

		// instanceMethod는 static이 아니니까 객체 생성 후 사용
		Computer computer = new Computer();
		double result3 = p1.action(computer::instanceMethod);
		System.out.println("result3 : " + result3);
	}

	private static void f3() {
		Calculable v1 = (a, b) -> a + b;
		double result = v1.calc(1, 2);
		System.out.println(result);
	}

	private static void f1() {
		// 1. 구현class
		// MyInterface는 만드는데 MyIml을 만들었을 때
		MyInterface a = new MyImpl();
		a.work();

		// 2. 익명
		// MyInterface는 있는데 MyImpl 안 만들고 내부에서 만듦
		MyInterface a2 = new MyInterface() {

			@Override
			public void work() {
				System.out.println("익명구현class");
			}
		};
		a2.work();

		// 3. 람다식
		// 2. 익명을 더 간단하게
		MyInterface a3 = () -> {
			System.out.println("3. 람다식");
		};
		a3.work();
	}
}
