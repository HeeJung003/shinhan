package com.shinhan.day09.MVC;

public class StudentView {
//student 보여주기
	public static void print(StudentDTO[] arr) {
		System.out.println("==모두 출력==");
		for(StudentDTO st:arr) {
			System.out.println(st);
		}
	}
	
	public static void print(StudentDTO st) {
		System.out.println("==한 건 출력==");
		System.out.println(st);
	}
}
