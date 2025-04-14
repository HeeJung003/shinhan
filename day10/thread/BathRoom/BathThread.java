package com.shinhan.day10.thread.BathRoom;

//Thread 상속받음
public class BathThread extends Thread {
	
	BathRoom room;
	String myname;
	
	//생성자
	public BathThread(String myname, BathRoom room) {
		this.myname = myname;
		this.room = room;
	}
	
	//thread니까 동작함
	@Override
	public void run() {
		//한 사람이 3번 사용함
		for(int i = 0; i < 3; i++) {
			room.use(myname);
		}
	}

}
