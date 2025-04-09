package com.shinhan.day05.add;

import com.shinhan.day05.Computer;

public class ComputerTest extends Computer{
	void f1() {
		Computer com1 = new Computer(); //같은 패지키 안에서 사용할 수 있음
		com1.os = "window";
		com1.price = 300;
		com1.print(); //모든 패키지에서 가능
		//com1.print2(); //같은 패키지에 있으면 가능.
		//com1.print3(); // 같은 패지키이면 가능, 패키지가 다르면 상속
		//com1.print4(); //같은 패키지여도 접근 X, 자신의 클래스에서만 접근 가능
		
		//상속받으면 다른 패키지에서도 접근 가능
		print3();
	
	}
}
