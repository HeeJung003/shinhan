package com.shinhan.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class Review {

	public static void main(String[] args) {
		//Collection
		
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new LinkedList<>();		
		List<Integer> c = new Vector<>(); //스레드에 안정적
		
		Set<Integer> d = new HashSet<Integer>();
		Set<Integer> e = new TreeSet<Integer>(); //반드시 sort가 구현되어야 됨 -. comparable를 구현한 class만 삽입가능
		
		//키는 유일해야 하기 때문에 set으로 되어있기 때문에
		Map<String, Integer> f = new HashMap<String, Integer>(); //(hashCode, equeals 동일성 체크)
		Map<String, Integer> h = new Hashtable<String, Integer>(); //스레드에 안정적
		Map<String, Integer> g = new TreeMap<String, Integer>(); //Comparable를 구현한 class만 put() 가능
		
		Stack<Integer> i = new Stack<>();
		Queue<Integer> j =  new LinkedList<>(); //queue는 인터페이스라서 new 불가 => new LinkedList
		
		Set<Book> data = new TreeSet<Book>();
		data.add(new Book("A", 100));
		data.add(new Book("A", 100));
		//System.out.println(data.size());
		
		
		Map<Book, Integer> data2 = new TreeMap<Book, Integer>();
		
		data2.put(new Book("A", 100), 300);
		data2.put(new Book("A", 100), 200);
		data2.put(new Book("A", 100), 100);
		System.out.println(data2.size());
		
		Set<Map.Entry<Book, Integer>> entrySet = data2.entrySet();
		for(Map.Entry<Book, Integer> en: entrySet) {
			System.out.println(en);
		}
	}

}


@Data
class Book implements Comparable<Book>{
	
	String title;
	int price;


	@Override
	public int compareTo(Book o) {
		return price - o.price; //asc
	}

	public Book(String string, int i) {
		// TODO Auto-generated constructor stub
	}
}
