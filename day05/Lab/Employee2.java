package com.shinhan.day05.Lab;

public class Employee2 {
	String id;
	String name;
	int baseSalary;
	
	public Employee2(String id, String name, int baseSalary) {
		super();
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}
	
	double getSalary(double bonus) {
		double salary;
		salary = baseSalary + (baseSalary*bonus);
		
	return salary;
	}
	
	//toString은 모든 class의 부모 클래스로 사용하는 object에서 제공되는 함수 -> 재정의 가능
	//재정의: 매서드 이름 같고 매개변수 개수와 타입 같아야
	//접근지정자(modifier)은 같거나 더 넓어야 함
	//접근권한: public >protected > 생략 > private
	public String toString() {
		String result= name
				+ "("
				+ id
				+ ") 사원의 기본급은 "
				+ baseSalary
				+ "원 입니다.";
		return result;
	}
	
	
}
