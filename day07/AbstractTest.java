package com.shinhan.day07;

abstract class AnimalParent{
	//어떤 동물인지 모르니까 구현 못 함
	//나중에 부모를 통해 자식을 보기 위해 만듦
	abstract void sound(); //해당 클래스에서 꼭 구현!!
	
	//일반메소드도 가능
	void f1() {
		System.out.println("AnimalParent f1()");
	};
}

//추상: 자식이 반드시 구현할 의무가 있음
//부모가 정의한 추상메서드를 반드시 구현해야 하지만 안 했으므로 이 class도 추상클래스 -> 나를 상속받는 애들이 구현하겠지
abstract class Animal extends AnimalParent{
	void f2() {
		System.out.println("AnimalParent f2()");
	};
}

class Cat extends Animal{
	void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍");
	}
	
}

public class AbstractTest {

	public static void main(String[] args) {
		work(new Dog());
		work(new Cat());
	}

	private static void work(Animal ani) {
		ani.sound();
	}

}
