package com.shinhan.day11;

//1초마다 자동으로 저장하고 싶음
public class AutoSaveThread extends Thread {

	void save() {
		System.out.println("1초마다 자동 저장");
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			save();
		}
	}
}
