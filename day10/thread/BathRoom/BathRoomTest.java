package com.shinhan.day10.thread.BathRoom;

public class BathRoomTest {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		BathRoom room = new BathRoom();
		
		BathThread t1 = new BathThread("김", room);
		BathThread t2 = new BathThread("박", room);
		BathThread t3 = new BathThread("양", room);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
