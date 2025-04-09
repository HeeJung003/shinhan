package com.shinhan.day05;

//class: object 만드는 틀, object는 각각의 특징을 갖는다.(field로 선언)
//VO(Value Object): 값을 저장하는 객체
//JavaBeans : 객체
//업무로직은 작성하지 않고 단지 값을 저장하려는 목적
//DTO(Data Transfer Object) : data를 저장해서 전송하려는 목적

public class NoteBook {
	private String model;
	private String company;
	private int price;
	
	
	public NoteBook(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	//Getter
	//변수들이 private이니까 접근할 수 없어. 중요한 데이터야. 접근하려면 이 함수를 거쳐 가
	public String getModel() {
		//로직
		return model;
	}
	
	public String getCompany() {
		//로직
		return company;
	}
	
	public int getPrice() {
		//로직
		return price;
	}
	
	//Setter
	//변수들을 접근 못 하게 막았는데 바꾸고 싶어. 함수한테 부탁 -
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	

}
