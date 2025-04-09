package com.shinhan.day05;

public class StudentTest {

	public static void main(String[] args) {
		//class test
		f2();

	}

	private static void f2() {
		Student st5 = new Student("홍길동4", "식품", 10, true);
		//System.out.println(st5.grade); -> 번거로우니 print함수를 만들자
		st5.print(); 
	}

	private static void f1() {
		System.out.println("before : " + Student.getCount() );
		System.out.println("before : " + Student.studentCount);
		Student st1 = new Student();
		Student st2 = new Student("홍길동");
		Student st3 = new Student("홍길동2", "컴공");
		Student st4 = new Student("홍길동3", "컴공", 100);
		Student st5 = new Student("홍길동4", "식품", 10, true);
		
		System.out.println("after 총학생수: " + Student.getCount() );
	}

}
