package com.shinhan.day05;


//final: 최종이다. 한 번 초기화하고 변경 불가능
public class Book {
	
	String title;
	int price;
	
	//final field
	//한 번 넣으면 바꿀 수 없음. 선언시 또는 생성시에 초기화
	final String author = "김작가"; //선언시 초기화
	final String author2; //여기서 안 했으니까
	
	//상수(static final): 이 클래스의 모든 object가 같은 값을 가지고 변경은 불가
	//일반적으로 이름은 대문자로 씀
	//지금 값을 줘야 됨 -> 선언시에만 값 할당 가능
	static final String PUBLISHER = "신한"; 
	
	//생성자
	public Book() {
		this.author2 = "아무개"; //여기서라도 생성할 때 꼬옥 초기화해야돼!
	}
	
	public Book(String title, int price, String author2) {
		super();
		this.title = title;
		this.price = price;
		this.author2 = author2; //생성했으니까 초기화됨 -> 값 못 바꿈
	}
	
	void updateAuthor(String author2) {
		//final field는 값 할당 후 변경 불가
		//this.author2 = author2; 
	}
	
	//final method...재정의 불가능(자식이 부모의 기능을 바꿀 수 없음)
	final void display() {
		System.out.println("Bookd의 display method");
	}
	
	
	//final class

}
