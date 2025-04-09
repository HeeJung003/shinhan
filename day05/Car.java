package com.shinhan.day05;

public class Car extends Object{

	String model;
	String color;
	int price;
	
	//static field
	static String company;
	
	//static method
	static void staticMethod() { //여러번 호출 가능(함수)
		//static에서 non-static 사용하려면 객체 생성 후 사용가능
		Car c = new Car();
		System.out.println(c.model);
	}
	//block... 호출하지 않아도 수행됨. 호출불가
	static {
		System.out.println("static block");
		Car c = new Car();
		System.out.println(c);
		
		//static에서 static 사용
		System.out.println(company);
		
		//static에서 non-static 사용 불가 -> new써야 가능
		//객체를 만들었으니까 c.toString()은 가능
		String s = c.toString();
	}
	static {
		System.out.println("static block2");
	}
	
//	- 생성자가 같은 이름의 다른 생성자 호출시 사용
//	- 멤버변수와 매개변수가 이름 같아서 충돌 발생, 구분하기 위해 현재 객체를 this라고 함
	

	//super: 부모를 의미
	//super(): 부모를 생성 후 자식을 생성
	//부모는 누구..? Object를 상속받음 생략됨
	//생성자에서 instance method 사용 불가 
	//-> 왜? 생성자가 수행 후 instance method를 쓸 수 있으니까
	public Car() {
		this(null, null, f1());
		System.out.println("기본 생성자");
	}
	
	static int f1() {
		//staitc 없음 -> 메모리 안 올라감 -> new해야 쓸 수 있음
		return 100;
	}

	public Car(String model) {
		this(model, null, 0);
	}

	public Car(String model, String color) {
		this(model, color, 0);
	}

	public Car(String model, String color, int price) {
		//super();
		this.model = model;
		this.color = color;
		this.price = price;
		//this(); //오류 : super()도 부모를 호출 -> 2번 호출됨 -> 오류
	}

	
	
	//오버라이딩(재정의, 덮어쓰기): 부모가 정의한 함수를 변경함
	//함수의 정의가 같아야 가능(이름같고 매개변수 같고 return도 같아야 함)
	/*public String toString() {
		String str = ("model: " + model + "color: " + color + "price :" + price);
		return str;*/
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + "]";
	}
}
	
	
