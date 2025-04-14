package com.shinhan.day10.generic;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

public class GenericTest {
	
	public static<M, S, C> Bag<M, S, C> MakeBag(M m, S s, C c) {
		return new Bag<>(m, s, c);
	}
	
	public static void useBag() {
	 MakeBag("모델", "사이즈", "컬러");
	 MakeBag("모델", 100, "red");
	 MakeBag ("모델", 100, 255);
	 MakeBag(123, 100, 255);
	 System.out.println(MakeBag(123, 100, 255));
	}
	
	
	public static <A, B> Product<A, B> makeProduct(A a, B b, int price) {
		Product<A, B> p1 = new Product();
		Product<A, B> p2 = new Product(a, b, 1000);

		//System.out.println(p1);
		//System.out.println(p2);
		return p2;
	}

	public static void main(String[] args) {
		// f3();
	
		useBag();
		
		Product<String, String> result_product = makeProduct("rk", "sh", 300);
		System.out.println(result_product);
		
		Product<Integer, Integer> result_product2 = makeProduct(1, 20, 300);
		System.out.println(result_product2);
	}

	private static void f3() {

		ArrayList<String> data = new ArrayList<>();
		// data.add(100); arrayList가 string이니까
		data.add("javaProgram");

		// int i = (Integer)data.get(0);
		String s = (String) data.get(0);
		System.out.println(s);

	}

	private static void f2() {
		// Collection: List(순서있음, 중복가능), SET(중복없음, 순서없음), MAP((키, 값)의 쌍)
		// List Interfacr : 구현class

		// 이렇게 하는건 바람직한 코드 아님 -> f3
		ArrayList data = new ArrayList();
		data.add(100);
		data.add("javaProgram");

		int i = (Integer) data.get(0);
		String s = (String) data.get(1);
	}

	private static void f1() {
		Product<String, String> p1 = new Product<>("AAA", "large", 1000);
		Product<String, Integer> p2 = new Product<>("BBB", 200, 2000);
		Product<Integer, Integer> p3 = new Product<>(3, 300, 3000);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
