package com.shinhan.day10.thread.BathRoom;

//공유영역
public class BathRoom {

	public synchronized void use(String name) {
		System.out.println(name + " 님이 입장");
		System.out.println(name + " 님이 사용");
		System.out.println(name + " 님이 퇴장");
		System.out.println("------------------");
	}
}
