package com.shinhan.day10.thread;

class Parent{
	
}

//자바는 다중상속 안됨
//만약에 다른 클래스를 상속하고 있으면 implements Runnable로 받아서 처리 
//Thread 아님
//Runnable 인터페이스를 구현하면 멀티쓰레드 가능 -> Runnable 안에 있는 run()은 반드시 구현해야 됨
public class NumberRunnableClass extends Parent implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 27; i++) {
			System.out.print(i);
		}
	}

}
