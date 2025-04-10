package com.shinhan.day08.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

//프로그램은 오류가 발생하면 중단됨
//Exception: 프로그래머의 노력으로 복구 가능한 오류(프로그램이 중단되지 않고 계속 진행됨)
//1) runtimeException: 컴파일시 체크 X -> unChecked Exception, 실행시에 오류 O
//					 ex) NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException (/by zero) ...
//2) 일단 exception(runtimeException이 아닌 exception) -> Checked Exception, 반드시 컴파일시 체크
//-----------

public class MyExceptionTest2 {
	
	public static void main(String[] args) {
		f7();
	}

	private static void f7(){
		int score = -30;
		//JVM이 자동으로 예외처리 못 함
		//비즈니스로직에 의해 강제로 예외를 일으키고자 함
		
		try {
		if(score < 0 || score > 100) {
			throw new MyException("0<=score<=100만 가능");
		}
		}catch(MyException a) {
			System.out.println(a.getMessage());
		}
		
		System.out.println("--f7 end---");
	}

	//ChecedException 1)떠넘김(main이 해결) 2)처리
	private static void f6() {
		try {
			Class aa = Class.forName("java.lang.String"); //클래스가 메모리에 올라감
			System.out.println(aa.getName());
			System.out.println(aa.getSimpleName());
			System.out.println(aa.getModifiers());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

	private static void f5() {
		try(FileReader fr = new FileReader("src/com/shinhan/day08/InnerClassTest.java")) {
			int data;

			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally {
			//본래는 자원반납이 이루어지는 위치
			//try(~~){}catch{}finally {} -> try를 벗어나면 자동으로 자원이 반납됨
		}
	}

	public static void f4(String[] args) {
		try {
			f3();
		} catch (IOException a) {
			System.out.println(a.getMessage());
		}

		System.out.println("==end==");
	}

	private static void f3() throws IOException {
		// 일반 exception
		// FileReader: 파일을 읽기 위해 파일열기, 2byte씩 읽을 수 있음
		FileReader fr = new FileReader("src/com/shinhan/day08/InnerClassTest.java");
		System.out.println("파일이 존재 ! 읽을 수 있음 !");

		int data;

		while ((data = fr.read()) != -1) { // EOF(End of File)
			System.out.print((char)data);
		}
		fr.close(); //자원반납
	}

	private static void f2() {
		String str = null;

		try {
			System.out.println(str.length());
		} catch (Exception a) {
			// RuntimException a = new NullPointerException() 자동으로 이렇게 형변화됨
			System.out.println(a.getMessage());
		} finally {
			System.out.println("반드시 실행됨");
		}

	}

	private static void f1(int j) {
		int[] arr = null;
		arr = new int[5];
		String score = "100점";

		try {
			int myScore = Integer.parseInt(score);
			System.out.println("배열접근 : " + arr[5]);
			int i = 10 / j; // ArithmeticException
			System.out.println(i);

		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		} catch (NullPointerException a) {
			System.out.println(a.getMessage());
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
		} catch (NumberFormatException a) {
			System.out.println("숫자형 문자만 int로 변경가능");
		} catch (Exception a) {
			// 형변환이 자동으로 이루어지므로 맨상위의 class를 마지막에 넣어야 됨
			System.out.println("기타 exception");
		} finally {
			System.out.println("exception 발생여부 상관없이 반드시 실행");
		}
	}

}
