package com.shinhan.day02;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*
 * java.base 모듈
 * ---java.lang패키지 안에 있는 모든 클래스는 import 없이 사용 가능
 * ---나머지 패키지에 있는 클래스는 import한 후 사용해야 함.
 */

public class PringTest {

	public static void main(String[] args) throws IOException {
		f6();
	}

	private static void f6() {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 입력 : ");
			String age = sc.nextLine();
			
			//문자 -> 숫자로 변경 -- Integer.parseInt
			int realAge = Integer.parseInt(age)-1;

			System.out.print("주소 입력 : ");
			String addr =sc.nextLine(); //한 줄 다 읽음
			
			System.out.printf("이름은 %s, 나이는 %d\n", name, realAge);
			
			sc.close(); //Scanner 쓰면 닫아야 함
	}

	private static void f5() {
		//next랑 nextLine 같이 쓰면 헷갈림
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next(); //홍 길동이면 '홍'만 읽음
		System.out.println(name);
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		String addr =sc.nextLine(); //한 줄 다 읽음
		System.out.println(addr);
		
		sc.close();
		
	}

	private static void f4() {
		InputStream is = System.in; //입력할거야
		Scanner sc = new Scanner(is); //Scanner가 입력을 도와줄거야
		System.out.print("이름 입력 : ");
		String name = sc.next();
		int age; //밖에서 출력할거니까 while 안에서 선언하면 안 됨
		
		//숫자로 입력될 때까지
		while(true) { //무한으로 돌거야: true
			System.out.print("나이 입력 : ");
			if(sc.hasNextInt()) { //hasNextInt -> sc로 입력받은게 int이면
				age = sc.nextInt(); //age로 입력받음
				break; //나감
			}else {
				System.out.println("나이는 숫자값만 입력");
				sc.next(); //잘못 입력한 값 읽은거 버리기 -> 이제 필요없으니까 선언할 필요도 없음
			}
		}
		
		System.out.printf("이름은 %s, 나이는 %d\n", name, age);
		
		sc.close(); //Scanner 쓰면 닫아야 함
		
	}

	//표준입력(키보드): System.in ==> InputStream
										//input 하다가 오류나면 JVM가 처리해. 프로그램 정지
	private static void f3() throws IOException {
		InputStream is = System.in; //입력할거야
		
		System.out.println("이름 입력 : ");
		while(true) {
			int data = is.read(); 	//.read()는 1byte만 읽을 수 있음 -> while문으로 
			if(data == 13) break; //13: Enter. enter 누르면 if문 탈출
			System.out.print((char)data);
		}
				
	}

	//표준출력(모니터): System.out ==> PrintStream
	private static void f2() {
		int score =100;
		String name = "홍길동";
		double score2 = 200.5;
		
		//메모리 차지하는 안 좋은 예. 메모리 낭비
		System.out.println("이름은 " + name + " 점수1:" + score + " 점수2:" + score2);
		System.out.println();
		//왼쪾 정렬: %-d
		//소수 밑에 두 자리: %10.2
		System.out.printf("이름은 %s 점수1:%d 점수2:%f\n", name, score, score2);
		System.out.println("끝");
		
	}

	private static void f1() {
		//출력방법: println(), print(), printf() --System 클래스 안에 들어있음
		//매개변수 이름이 같고 모양이 다름: overloading
		
		System.out.print(false);
		System.out.print(10);
		System.out.println();
		System.out.print(true);		
	}

}
