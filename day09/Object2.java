package com.shinhan.day09;

import java.util.HashSet;

public class Object2 {

	public static void main(String[] args) {
		f7();
	}
	
	private static void f7() {
		String str1 = "신한DS 소프트아카데미";
		String str2 = "신한DS 소프트아카데미";
		PersonVO p1 = new PersonVO("a", 1, null);
		PersonVO p2 = new PersonVO("b", 1, null);
		
		System.out.println(p1.equals(p2)); 
		System.out.println(p1.hashCode() == p2.hashCode());
		
		System.out.println(str1); //자동으로 toString이 호출됨
		System.out.println(p1); //> PersonVO에서 toSTring 재정의했기 때문에 재정의된 내용이 출력됨
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode() == str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}

	private static void f6() {
		PersonVO v1 = new PersonVO ("홍길동", 20, "학생");
		PersonVO v2 = new PersonVO ("홍길동", 20, "학생");
		System.out.println(v1.toString());
		System.out.println(v1.equals(v2)); //내용은 같고 주소는 다름 -> true		
	}

	private static void f5() {
		//Collection: List, Set(순서없고 중복불가, 키로 사용함), Map
		//set interface를 구현한 class : HashSet
		HashSet<Coffee> data = new HashSet<Coffee>();
		data.add(new Coffee("아메리카노", 3000));
		data.add(new Coffee("아메리카노", 5000));
		for(Coffee s:data ) { //해시코드 재정의 -> 한 번만 찍힘
			System.out.println(s); 
		}
	}
	

	private static void f4() {
		//Collection: List, Set(순서없고 중복불가, 키로 사용함), Map
		//set interface를 구현한 class : HashSet
		HashSet<String> data = new HashSet<String>();
		data.add("월요일");
		data.add("월요일");
		for(String s:data ) {
			System.out.println(s); //월요일 한 번만 찍힘-> 중복체크
		}
	}

	private static void f3() {
		Coffee obj1 = new Coffee("아메리카노", 3000);
		Coffee obj2 = new Coffee("아메리카노", 3000);
		
		System.out.println(obj1);
		System.out.println(obj1.toString()); //재정의없으면 Object의 toString : 주소return
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString()); //재정의없으면 Object의 toString : 주소return
		System.out.println(obj2.hashCode());
		
		System.out.println(obj1 == obj2? "주소 같음":"주소 다름"); //false -> new할 때마다 달라짐
		System.out.println(obj1.equals(obj2)? "내용 같음":"내용 다름"); //String이 재정의해서 내용 비교 -> true
		//재정의없으면 Object의 equls() : 주소 비교 -> 나는 내용을 보고 싶은데
		System.out.println(obj1.equals("???")); //문자를 커피로 형변환 안 됨 -> if(!(obj instanceof Coffee)) return false;
		
	}

	private static void f2() {
		String obj1 = new String("자바");
		String obj2 = new String("자바");
		
		System.out.println(obj1);
		System.out.println(obj1.toString()); // 원래는 주소를 나타냄 -> String이 toString을 재정의해서 문자 자신이 리턴됨
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString()); // 원래는 주소를 나타냄 -> String이 toString을 재정의해서 문자 자신이 리턴됨
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2? "주소 같음":"주소 다름"); //false -> new할 때마다 달라짐
		System.out.println(obj1.equals(obj2)? "내용 같음":"내 다름"); //String이 재정의해서 내용 비교 -> true
			
	}


	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2? "주소 같음":"주소 다름"); //false
		System.out.println(obj1.equals(obj2)? "주소 같음":"주소 다름"); //false -> .equals는 주소 비교
			
	}

}
