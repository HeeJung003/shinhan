package com.shinhan.day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.shinhan.day11.collection.Board;

public class CollectionTest2 {

	public static void main(String[] args) {
		f9();
	}

	private static void f9() {
		// TreeMap
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("java", 10);
		data.put("apple", 10);
		data.put("html", 10);
		data.put("zoo", 10);
		data.put("banana", 20); //키가 중복되면 값은 대체됨
		
		System.out.println("first : " + data.firstKey());
		System.out.println("first entry : " + data.firstEntry()); //key=value
		
		NavigableMap<String, Integer> data2 = data.descendingMap();
		

		System.out.println("----------keySet");
		for (String key : data2.keySet()) {
			System.out.println(key + "=> " +data2.get(key));
		}
		
		System.out.println("----------entrySet");
		for(Entry<String, Integer> en:data.entrySet()) {
			System.out.println(en.getKey() + " -> " + en.getValue());
		}
	}

	private static void f8() {
		// first, last, lower, higher, floor, ceiling, 부분집합
		TreeSet<Integer> data = new TreeSet<>();
		data.add(400);
		data.add(500);
		data.add(200);
		data.add(300);
		data.add(100);
		System.out.println("first : " + data.first());
		System.out.println("last : " + data.last());
		System.out.println("lower : " + data.lower(300)); // 200
		System.out.println("higher : " + data.higher(300)); // 400
		System.out.println("floor : " + data.floor(299)); // 200
		System.out.println("ceiling : " + data.ceiling(299)); // 300

		NavigableSet<Integer> data2 = data.descendingSet();

		System.out.println("===데이터 목록===");
		for (Integer ts : data2) {
			System.out.println(ts);
		}

		System.out.println("===부분집합 (<=)===");
		NavigableSet<Integer> data3 = data.tailSet(300, true); // 300부터 자를거야
		for (Integer ts : data3) {
			System.out.println(ts);
		}

		System.out.println("===부분집합 (<= <)===");
		NavigableSet<Integer> data4 = data.subSet(200, true, 400, false); // 300부터 자를거야
		for (Integer ts : data4) {
			System.out.println(ts);
		}
	}

	private static void f7() {
		TreeSet<Board> data = new TreeSet<>();
		data.add(new Board("a", "a2", "a3"));
		data.add(new Board("c", "c2", "c3"));
		data.add(new Board("f", "f2", "f3"));
		data.add(new Board("b", "b2", "e3"));
		data.add(new Board("e", "e2", "e3"));

	}

	private static void f6() {
		TreeSet<String> data = new TreeSet<>();
		data.add("c");
		data.add("a");
		data.add("b");
		data.add("e");
		data.add("f");

		for (String ts : data) {
			System.out.println(ts);
		}
	}

	private static void f5() {
		// TreeSet
		TreeSet<Integer> data = new TreeSet<>();
		data.add(400);
		data.add(500);
		data.add(200);
		data.add(300);
		data.add(100);

		for (Integer ts : data) {
			System.out.println(ts);
		}
	}

	private static void f4() {
		// board로 sort
		Board[] arr = { new Board("a", "a2", "a3"), new Board("d", "d2", "d3"), new Board("b", "b2", "b3"),
				new Board("c", "c2", "c3"), new Board("e", "e2", "e3") };

		Arrays.sort(arr);
		// System.out.println("After : " + Arrays.toString(arr));
		// Board cannot be cast to class java.lang.Comparable
		// -> Board에서 Comparable implement하기 -> compareTo 작성
		for (Board board : arr) {
			System.out.println(board);
		}

		// sort 기준이 바뀌었다면!! (Board class 바꾸면 다 바뀌니까 변경 X)
		Arrays.sort(arr, new Comparator<Board>() {
			@Override
			public int compare(Board o1, Board o2) {
				return o1.getContent().compareTo(o2.getContent());
			}
		});
		System.out.println("------------");
		for (Board board : arr) {
			System.out.println(board);
		}
	}

	private static void f3() {
		String arr[] = { "java", "sql", "wekb", "html", "js" };
		// 람다로 바꾸기
		Arrays.sort(arr, (o1, o2) -> {
			return o2.compareTo(o1);
		});
		System.out.println("After : " + Arrays.toString(arr));
	}

	private static void f2() {
		String arr[] = { "java", "sql", "wekb", "html", "js" };
		// 자바에서 제공하는 sort
		// Arrays.sort(arr);

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		System.out.println("After : " + Arrays.toString(arr));

	}

	private static void f1() {
		Integer arr[] = { 80, 66, 90, 54, 79 };
		System.out.println("Before: " + Arrays.toString(arr));

		// sort 직접 구현
		// f_sort(arr);

		// java가 제공하는 sort -> 무조건 ascending
		// Arrays.sort(arr); // 무조건 ascending

		// sort 기준을 변경하고자 함 -> 원하는 모양으로 구현할 수 있음
		// 1. 구현class만들기 => DescendingInteger
		// Arrays.sort(arr, new DescendingInteger());

		// 2. 익명구현class만들기
//		Arrays.sort(arr, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//		});

		// 3.람다표현식
		Arrays.sort(arr, (a, b) -> a - b);

		System.out.println("After : " + Arrays.toString(arr));
	}

//	private static void f_sort(int[] arr) {
//		//Ascending (>) Descending (<)
//		for(int i =0 ; i < arr.length-1; i++) {
//			for(int j = i+1; j < arr.length;j++) {
//				if(arr[i] < arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//	}

}
