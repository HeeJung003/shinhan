package com.shinhan.day10;

import java.io.FileReader;
import java.net.URL;

public class ResourceTest {

	public static void main(String[] args) {
		//아까 printService 가져오고 싶음
		method2();
	}

	private static void method2() {
		Class cls = ResourceTest.class;
		URL url  = cls.getResource("images/image.png");
		System.out.println(url.getPath());
	}

	private static void method() {
		//프로젝트가 default 경로
		//FileReader fr = new FileReader("src/com.shinhan.day10.PrintService.java");
		
		//현재 파일이 있는 경로에서 읽고 싶음. 현재 클래스
		Class cls = ResourceTest.class;
		
		URL url = cls.getResource("PringAnnotation.class");
		System.out.println(url.getPath());
	}

}
