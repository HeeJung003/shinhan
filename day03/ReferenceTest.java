package com.shinhan.day03;

import java.util.Scanner;

public class ReferenceTest {

	public static void main(String[] args) {
		//f2("과장");
		f7();

	}

	private static void f8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력 (,구분) : ");
		String data = sc.nextLine();
		String arr[] = data.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		
	}

	private static void f7() {
		String board = "게시글번호,제목,내용,작성자";
		//하나씩 자르고 싶음 -> 저장은?
		//이름은 하나이고 같은 타입의 데이터를 여러개 저장하기 위한 연속적인 저장공간
		String arr[] = board.split(",| |%"); //String이 여러개 있어요. 이름은 arr, ,거나 공백이거나, %
		System.out.println(arr.length);
		for(int i = 0; i<=arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

	private static void f6() {
		String s1 = "javaProgram good";
		System.out.println(s1.substring(4)); //4번째부터 끝까지
		System.out.println(s1.substring(4, 12)); //4번째부터 12까지
		System.out.println(s1.indexOf("g")); //g 위치 어디야?
		System.out.println(s1.substring(s1.indexOf("m")));
		
	}

	private static void f5() {
		String s1 = "자바프로그램 잘하기";
		String s2 = "javaProgram good";
		
		System.out.println(s2.replace("good", "굳")); //순간 바뀐거
		System.out.println(s2); //다시 찍었을 때는 good으로 나옴
		
		s2 = s2.replace("good", "굳"); //저장해서 넣읕면 바뀜
		System.out.println(s2); //굳
		
		//System.out.println(s1.charAt(0));
		//System.out.println(s1.length());
		
		for(int i=0; i<s2.length(); i++) { //i<s1.length() -> 등호 안 들어감 -> 주의!!
			
			char ch = Character.toUpperCase(s2.charAt(i));
			System.out.print(ch);
		}
	}

	private static void f4() {
		String s1 = null; //아직 참고하고 있지 않다고 초기화, 지역변수는 초기화하고 사용해야 함
		
		System.out.println(s1);
		System.out.println(s1.charAt(0)); //값이 없는데 어떻게 기능을 써? -> 오류 -> null값에 기능사용 불가 -> NullPointerExcetion
		
	}

	private static void f3() {
		String s1 = "자바";
		String s2 = s1; //주소 같음
		String s3 = new String("자바");
		
		//String은 변경 불가능. 고정문자열임. 
		s1 = s1+ "!!!"; //새로운 주소 생김
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
	}

	private static void f2(String str) {
		int salary = 0;
		str += "님";
		
		if(str.equals("과장님")) { //str == "과장님 " : 원래는 과장으로 들어왔으나 과장님으로 바뀜 -> .equals 써야 됨
			salary = 100;
		}else if(str.equals("부장님")) {
			salary = 200;
		}else {
			salary = 300;
		}
		System.out.println(str + " : " + salary);
	
	}

	private static void f1() {
		//new가 붙었냐 안 붙었냐 차이 -> 객체 생성 시기
		String s1 = "자바"; //컴파일타임에 객체 생성 후 저장됨 -> s1, s2가 "자바"를 가리킴
		String s2 = "자바"; 
		String s3 = new String("자바"); //실행시 객체 생성 후 저장됨 -> 생성될때마다 주소값 다름
		String s4 = new String("자바");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		//주소 확인
		System.out.println(s1==s2); //true
		System.out.println(s3==s4); //false
		
		//내용 확인
		System.out.println(s1.equals(s2)); //true
		System.out.println(s3.equals(s4)); //true
		
		
		s1 += "프로그램";
		s2 += "프로그램";
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
	}

}
