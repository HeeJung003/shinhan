package com.shinhan.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import lombok.Builder;

@Builder
public class CollectionTest3 {
	//stack, queue, synchronized, 수정 불가한 collection

	public static void main(String[] args) {
		// f2();
		f5();

	}

	private static void f5() {
		
		List<String> myList = new ArrayList<>();
		myList.add("A");myList.add("AA");myList.add("AAA");myList.add("AAAA");
		
		//수정 불가한 collection: of(), copy(), asList(), 배열->list
		List<Integer> data = List.of(1, 2, 3, 4, 5);
		List<String> data2 = List.of("a", "b", "c", "d", "e");
		Set<Integer> data3 = Set.of(1, 2, 3, 4, 5, 6); //중복된 값은 set 만들기 불가
		Map<String, Integer> data4 = Map.of("A", 100, "B", 200, "C", 300);
		
		List<String> data5 = List.copyOf(myList);
		
		//data.add(6); //실행오류, ImmutableCollections -> 변경불가
		//data2.add("g");
		System.out.println(data2);
		System.out.println(data2.contains("d")); //d가 있어?
		
		System.out.println(data5);
		//data5.add("CCC"); //수정 불가		
		
	}

	private static void f4() {
		List<String> data = Collections.synchronizedList(new ArrayList<>());
	
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add("내용" + i);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add("내용" + i);
				}
			}
		};

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(data.size());

	}

	private static void f3() {
		// 방법1
		Map<Integer, String> data = Collections.synchronizedMap(new HashMap<>());
		// 방법 2 -> hashtable은 동기화 지원하니까
		// Map<Integer, String> data = new Hashtable<Integer, String>();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.put(i, "내용" + i);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.put(i, "내용" + i);
				}
			}
		};

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(data.size());
	}

	private static void f2() {
		// Queue 는 interface
		Queue<Student> data = new LinkedList<>();

		// Student st1 =
		// Student.builder().stdId("1").name("김").major("컴").score(200).build();
		data.add(new Student("111", "가", "컴퓨터", 80));
		data.add(new Student("222", "가", "경영", 50));
		data.add(new Student("333", "가", "미술", 40));
		data.add(new Student("444", "가", "음악", 100));
		data.add(new Student("555", "가", "컴퓨터", 80));
	}

	private static void f1() {
		// stack
		Stack<Student> data = new Stack<>();

		data.add(new Student("111", "가", "컴퓨터", 80));
		data.add(new Student("222", "가", "경영", 50));
		data.add(new Student("333", "가", "미술", 40));
		data.add(new Student("444", "가", "음악", 100));
		data.add(new Student("555", "가", "컴퓨터", 80));

		for (Student sd : data) {
			data.push(sd);
		}

		System.out.println(data.pop());
	}

}