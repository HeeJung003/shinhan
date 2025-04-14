package com.shinhan.day10.thread.calcuator;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + memory);
	}

	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " : " + memory);
			}
		}
	}

}
