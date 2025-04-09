package com.shinhan.day05.Lab;

public class Employee {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;
	
	public Employee(String name, String title, int baseSalary) {
		this.name = name;
		this.title = title;
		this.baseSalary = baseSalary;
		//안 넣어서 해결 못 함
		//밑에서 계산하고 불러야 됨. 여기에서
		getTotalSalary();
	}

	public void getTotalSalary() {
		
		//문자열에서 사용하는 리터럴값은 같은 주소의 값을 사용
		// ==(주소비교) 쓰는 건 좋지 않음
		// 참조형은 값비교시 .equals()기능을 이용
		if(title.equals("부장")) {
			totalSalary = (int) (baseSalary+(baseSalary*0.25));
		}else if(title.equals("과장")) {
			totalSalary = (int) (baseSalary+(baseSalary*0.15));
		}else {
			totalSalary = (int)(baseSalary+(baseSalary*0.05));
		}
	}
	void print() {
		System.out.printf("%s 직급의 %s씨의 본봉은 %d 원이고 총급여는 %d 입니다.\n", name, title, baseSalary, totalSalary);
	}
	
}
