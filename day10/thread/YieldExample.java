package com.shinhan.day10.thread;

public class YieldExample {
public static void main(String[] args) {
	WorkThread a = new WorkThread("A");
	WorkThread b = new WorkThread("B");
	a.start();
	b.start();
	
	try {
		Thread.sleep(5000);
	}catch(InterruptedException e) {
		b.work = false;
	}
	
	try {
		Thread.sleep(10000);
	}catch(InterruptedException e) {
		b.work = true;
	}
}
}
