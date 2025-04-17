package com.shinhan.day13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException {

		//서버 소켓 만들기
		ServerSocket serverSocket = new ServerSocket(5001);
		System.out.println("서버가 클라이언트 접속을 기다림");
		Socket socket = serverSocket.accept(); //블로킹
		
		InetSocketAddress addr = (InetSocketAddress)socket.getRemoteSocketAddress();
		System.out.println(addr.getAddress() );
	}
}
