package com.shinhan.day11;

import java.util.TreeSet;

public class StudentSortTest {

	public static void main(String[] args) {
		studentSort();

	}

	private static void studentSort() {
		TreeSet<Student> data = new TreeSet<>();
		data.add(new Student("111", "가", "컴퓨터", 80));
		data.add(new Student("222", "가", "경영", 50));
		data.add(new Student("333", "가", "미술", 40));
		data.add(new Student("444", "가", "음악", 100));
		data.add(new Student("555", "가", "컴퓨터", 80));
		
		System.out.println("first: " + data.first());
		System.out.println("last: " + data.last());
		System.out.println(data.lower(new Student("111", "가", "컴퓨터", 80)));
		System.out.println(data.higher(new Student("444", "가", "음악", 100)));
		System.out.println();
		
		for(Student st:data) {
			System.out.println(st);
		}
	}

}
