package com.shinhan.day05.Lab;

public class EmployeeExam {
	public static void main(String[] args) {

		Employee em1 = new Employee("이부장", "부장", 1500000);
		Employee em2 = new Employee("김과장", "과장", 1300000);
		Employee em3 = new Employee("최대리", "대리", 1200000);
		Employee em4 = new Employee("박사원", "사원", 1000000);
		
		em1.print();
		em2.print();
		em3.print();
		em4.print(); 
		//이렇게 쓰는 것보다 배열을 만들어서 사용하는게 더 효율ㅈㄱ
		
		System.out.println();
		Employee[] empArr = new Employee[2];
		empArr[0] = new Employee("이부장", "부장", 1500000);
		empArr[1] = new Employee("김과장", "과장", 1300000);
		
		for(Employee emp : empArr) {
			emp.print();
		}
	}
}
