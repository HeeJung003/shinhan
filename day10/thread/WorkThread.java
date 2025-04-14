package com.shinhan.day10.thread;

public class WorkThread extends Thread {
	public boolean work = true;

	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		while (true) {
			if (work) {
				System.out.println(Thread.currentThread().getName() +  ": 작업처리");
			} else {
				Thread.yield();
			}
		}
	}
}
