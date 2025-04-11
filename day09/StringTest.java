package com.shinhan.day09;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		f7();
	}

	private static void f7() {
		String data = "100";
		int i = Integer.parseInt(data);
		System.out.println(i);
	}

	private static void f6() {
		//기본형타입: 값을 저장하고 연산하고 비교하고만 가능
		//참조형타입: 기본형+기능 => wrapper class(포장 클래스)
		int a = 100;
		Integer b = new Integer(200); //deprecate 권장하지 않아. 더 좋은 방법이 있어
		Integer c = 300; //new Integer(300) autoBoxing
		
		System.out.println(c.intValue()); //이렇게 할 필요없어. 밑 문장처ㅓㄻ unboxing하면 돼
		System.out.println(c); //unBoxing
		
		char v1 = 'a';
		System.out.println(Character.toUpperCase(v1));
		
	}

	private static void f5() {
		String str = "이것이 자바다, 데이터 베이스, 리엑트";
		StringTokenizer st = new StringTokenizer(str, ", ");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

	private static void f4() {
		String str = "이것이 자바다, 데이터 베이스, 리엑트";
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(str.charAt(5));
		
		String[] arr2 = str.split("[, | ]"); //콤마 또는 공백으로 나누기
		System.out.println(Arrays.toString(arr2));
	}

	private static void f3() {
		//고정 문자열 저장(수정불가), 연결연산자 사용 가능
		String s1 = "자바";
		//가변문자 > 수정가능 > StringBuilder
		StringBuilder sb = new StringBuilder("자바");
		StringBuffer sb2 = new StringBuffer("자바");
		
		System.out.println("일시적으로 바뀜 : " + s1.replace("바", "자")); //일시적
		s1 = s1.replace("바", "자"); //바뀜 -> 주소가 바뀜
		System.out.println("할당해서 주소가 바뀜 : " + s1);
		
		
		s1 = s1 + "프로그램"; //연결연산자 사용 가능
		sb.replace(0, 1, "java");
		sb2.append("program");
		
		System.out.println("s1 : " + s1); //안 바뀜 -> 할당하면 바뀜
		System.out.println("sb : " + sb);
		System.out.println("sb2 : " + sb2);
		
		
	}

	private static void f2() {
		//522, 523페이지
		String s = "자바";
		try {
			//UTF-8 : 한글자는 3byte
			byte[] arr = s.getBytes("UTF-8"); //문자를 바이트로 바꿈. 인코딩한다.
			//System.out.println(arr); 주소찍힘
			System.out.println(Arrays.toString(arr));
			String s2 = new String(arr, "UTF-8"); //문자로 다시 바꿈. 디코딩한다.
			System.out.println(s2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	
	}

	private static void f1() {
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		
		char[] arr = new char[] {'자', '바'};
		String s4 = new String(arr);
		System.out.println(s4.equals(s3)); //안에 들어있는 내용이 같다
	
 	}

}
