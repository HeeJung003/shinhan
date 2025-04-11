package com.shinhan.day09;

//9장 연습문제

public class Chatting {
	// instance inner class
	class Chat {
		void start() {
			System.out.println("instance inner class-- start");
		}

		void sendMessage(String message) {
			System.out.println("instance inner class-- sendMessage : " + message);
		}
	
	}
	
	static class Chat2 {
		void start() {
			System.out.println("instance inner class-- start");
		}

		void sendMessage(String message) {
			System.out.println("instance inner class-- sendMessage : " + message);
		}
		
	}
	
	void f1() {
		//내부에 있으니까 Chat만 new 
		Chatting.Chat a = new Chat();
		a.start();
		a.sendMessage("ff");
	}
	
	void f2() {
		//Chat2이 static이니까 Chatting도 new 해야 됨
		//Chatting의 Chat2
		Chatting.Chat2 aa = new Chatting.Chat2();
		aa.start();
		aa.sendMessage("ss");
	}

	public static void main(String[] args) {
		new Chatting().f1();
		new Chatting().f2();
	}


	void startChat(String chatId) {
		String nickName = null;
		//nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}
