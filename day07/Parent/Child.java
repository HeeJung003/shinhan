package com.shinhan.day07.Parent;

public class Child extends Parent{
	String myName;
	
	int score; //부모랑 필드이름 같음 -> 상속에서는 나(자식)이 먼저 -> main에서는 child.socre = 100으로 되어 있으니까 오류
	
	
	public Child() {
		//super(); ..부모생성자를 호출함생략가능) -> 첫번째줄만 가능
		System.out.println("자식1 default 생성자");
		//super -> 생략되어도 super()가 먼저 생성되기 때문에 밑에 넣을 수 없음
	}
	
	public Child(int score, String myName) {
		super(score); //명시적으로 부모생성자 부름
		this.myName = myName;
	}
	
	//3. method 추가 
	void display() {
		System.out.println("score = " + score);
		System.out.println("myname = " +myName);
	}
	
	//4. method 수정
	//오버라이딩
	//부모와 리턴타입, 매개변수, 메소드 이름 같아야 됨
	//접근 지정자(Modifier)는 같거나 넓어져야 한다.
	@Override
	void info() {
		//System.out.println("자식의 info 메소드 : score ="  + score);
		super.info();
		System.out.println("자식의 info 메소드 : score ="  + score);
		System.out.println("자식의 info 메소드 : myname ="  + myName);
	}
	
	//오버라이드 X, 오버로딩
	//오버로딩: 이름 같고 매개변수 다름
	void info(String title) {
		//System.out.println("자식의 info 메소드 : score ="  + score);
		super.info();
		System.out.println("자식의 info 메소드 : title ="  + title);
	}
	
}
