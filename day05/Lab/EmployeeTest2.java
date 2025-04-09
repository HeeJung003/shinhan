package com.shinhan.day05.Lab;

public class EmployeeTest2 {

	public static void main(String[] args) {
	
		Employee2[] empArr = new Employee2[4];
		double[] bonus = {0.1, 0.2, 0.3, 0.4};
		int index = 0;
		
		empArr[0] = new Employee2("1", "부장", 1500000);
		empArr[1] = new Employee2("2", "과장", 1300000);
		empArr[2] = new Employee2("3", "대리", 1300000);
		empArr[3] = new Employee2("4", "사원", 1300000);
		
		for(Employee2 emp : empArr) {
			System.out.println(emp + "보너스는 " + emp.getSalary(bonus[index++]));;
		}
	
	}
}
