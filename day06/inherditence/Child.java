package com.shinhan.day06.inherditence;

//자바는 단일상속만 가능(부모1개)
//자식이 부모를 선택
//자식은 부모가 누군지 알지만, 부모는 자식이 누군지 알 수 없음 
public class Child extends Parent{
	//상속받은 후 필드 추가 가능
	int salary;
	
	public Child() {
		//super() 숨어있음 -> 부모의 생성자 지나감
		System.out.println("자식 default 생성자");
	}
	
	public Child(String name, int age) {
		//super() 숨어있음 -> 부모의 생성자 지나감 -> 임시적으로 기본생성자를 부름
		//부모한테 있는데 또 부르는건 비효율적 
		//this.name = name;
		//this.age = age;
		
		//명시적으로 부모 생성자를 부름
		super(name, age);
		
		System.out.println("자식의 arg2개 생성자");
	}
	
	public Child(String name, int age, int salary) {
		super(name, age);
		this.salary=salary;
		System.out.println("자식의 arg3개 생성자");
	}
	
	//함수는 함수를 추가, 사용 가능
	void display() {
		print();
		System.out.println("급여는 " + salary);
	}
}
