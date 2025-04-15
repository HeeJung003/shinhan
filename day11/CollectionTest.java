package com.shinhan.day11;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import com.shinhan.day11.collection.Board;

public class CollectionTest {

	public static void main(String[] args) {
		f11();
	}

	private static void f11() {
		//설정값 읽어오기
		Properties pro = new Properties();
		
		InputStream is = CollectionTest.class.getResourceAsStream("oracle.properties");
		try {
			pro.load(is);
			
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String userid = pro.getProperty("userid");
			String password = pro.getProperty("password");
			
			System.out.println(driver);
			System.out.println(url);
			System.out.println(userid);
			System.out.println(password);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void f10() {
		//HashTable
		Hashtable<String, Integer> data = new Hashtable<>();
		
		Runnable r1 = () -> {
			for(int i= 1; i <=1000; i++) {
				data.put(String.valueOf(i), i);
			}
		};
		

		Runnable r2 = () -> {
			for(int i= 1001; i <=2000; i++) {
				data.put(String.valueOf(i), i);
			}
		};
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
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
		
		System.out.println("map의 개수 : " + data.size());
		
	}

	private static void f9() {
		// f8을 Board로 바꾸기
		Map<Board, Integer> data = new HashMap<>();
		data.put(new Board("a", "a2", "a3"), 100);
		data.put(new Board("a", "a2", "a3"), 90); //키가 같으면 새로운 값으로 대체됨
		data.put(new Board("a", "a2", "a3"), 20);
		data.put(new Board("a", "a2", "a3"), 30);

		//확인방법1 keyset
		Set<Board> keys = data.keySet();
		
		for(Board key:keys) {
			System.out.println(key + "=> " + data.get(key));
		}
		
		System.out.println("-----------------");
		//확인방법2 enteyset
		Set<Entry<Board,Integer>> entryset = data.entrySet();
		for(Entry<Board, Integer> en:entryset) {
			System.out.println(en.getKey() + " -> " + en.getValue());
		}
		
	}

	private static void f8() {
		// Map :hashMap, hashtable
		Map<String, Integer> data = new HashMap<>();
		data.put("key", 100);
		data.put("key", 90); //키가 같으면 새로운 값으로 대체됨
		data.put("key2", 20);
		data.put("key3", 30);
		data.put("key4", 40);
		
		//확인방법1 keyset
		Set<String> keys = data.keySet();
		
		for(String key:keys) {
			System.out.println(key + "=> " + data.get(key));
		}
		
		System.out.println("-----------------");
		//확인방법2 enteyset
		Set<Entry<String,Integer>> entryset = data.entrySet();
		for(Entry<String, Integer> en:entryset) {
			System.out.println(en.getKey() + " -> " + en.getValue());
		}
		
	}

	private static void f7() {
		// Board
		Set<Board> data = new HashSet<>();
		data.add(new Board("Sub1", "Con1", "Wri1"));
		data.add(new Board("Sub2", "Con2", "Wri2"));
		data.add(new Board("Sub3", "Con3", "Wri3"));
		data.add(new Board("Sub3", "-", "-"));
		Board board = Board.builder().subject("Sub5").content("Con4").writer("wir4").build();
		
		System.out.println(data.size()); //중복허용 X
		System.out.println(data.contains(new Board("Sub3", "Con3", "Wri3")));
		
		//향상된 for문 -> index불필요시 사용
		for(Board s:data) {
			System.out.println(s);
		}
		//set은 순서가 없으니까 일반 for문 불가
		System.out.println("=======일반 for=======");
		System.out.println("===반복자 이용(iterator)===");
		Iterator<Board> it = data.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

	private static void f6() {
		// SET : 순서없음, 중복허용 X
		// 구현클래스: hashSet
		Set<String> data = new HashSet<>();

		data.add("일");
		data.add("월");
		data.add("화");
		data.add("수");
		data.add("수");

		System.out.println(data.size()); //중복허용 X
		System.out.println(data.contains("금"));
		
		for(String s:data) {
			System.out.println(s);
		}

	}

	private static void f5() {
		// Vector
		List<Board> data = new Vector<>();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add(new Board("Sub1" + i, "Con1" + i, "Wri1" + i));
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add(new Board("Sub1" + i, "Con1" + i, "Wri1" + i));
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join(); // 끝날 때까지 기다리기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			t2.join(); // 끝날 때까지 기다리기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// data.size하면 main이 먼저 끝날테니까 0으로 출력됨
		// t1, t2가 끝날 때까지 기다리고 data.size 출력 -> 2000
		System.out.println("벡터에 저장된 data의 개수 : " + data.size());

		display(data);
	}

	private static void f4() {
		// f3을 linkedlist로
		LinkedList<Board> data = new LinkedList<>();
		data.add(new Board("Sub1", "Con1", "Wri1"));
		data.add(new Board("Sub2", "Con2", "Wri2"));
		data.add(new Board("Sub3", "Con3", "Wri3"));
		Board board = Board.builder().subject("Sub5").content("Con4").writer("wir4").build();
		data.add(board);

		// System.out.println("2번째 data 얻기: " + data.get(2));
		data.remove(2);
		System.out.println("2번째 data 얻기: " + data.get(2));

		display(data);
	}

	private static void f3() {
		// List가 interface: 구현 클래스는 ArrayList or LinkedList or vector
		// ArrayList
		List<Board> data = new ArrayList<>();
		data.add(new Board("Sub1", "Con1", "Wri1"));
		data.add(new Board("Sub2", "Con2", "Wri2"));
		data.add(new Board("Sub3", "Con3", "Wri3"));
		Board board = Board.builder().subject("Sub5").content("Con4").writer("wir4").build();
		data.add(board);

		// System.out.println("2번째 data 얻기: " + data.get(2));
		data.remove(2);
		System.out.println("2번째 data 얻기: " + data.get(2));

		display(data);
	}

	private static void display(List<Board> data) {
		for (Board board : data) {
			System.out.println(board);
		}
	}

	private static void f2() {
		// LinkedList
		List<Integer> data = new LinkedList<>();
		data.add(100);
		data.add(200);
		data.add(300);

		System.out.println(data);

		ArrayList<String> data2 = new ArrayList<>();
		data2.add("월");
		data2.add("화");
		data2.add("수");
		data2.add("목");
		data2.add("금");
		data2.add("금");
		data2.add("일");

		System.out.println(data2);

	}

	private static void f1() {
		// 여러개를 모아놓은 자료구조 : array, collection
		// List interface 구현 중 arrayList

		ArrayList<Integer> data = new ArrayList<>();
		data.add(100);
		data.add(200);
		data.add(300);

		System.out.println(data);

		ArrayList<String> data2 = new ArrayList<>();
		data2.add("월");
		data2.add("화");
		data2.add("수");
		data2.add("목");
		data2.add("금");
		data2.add("금");
		data2.add("일");

		System.out.println(data2);
	}

}
