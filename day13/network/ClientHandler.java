package com.shinhan.day13.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Set;

//멀티쓰레드 가능하기 위해 Runnable interface 구현 -> 여러 사람이 한 서버에 통신하기 위해
public class ClientHandler implements Runnable {

    private Socket socket; //소켓으로 통신할거야
    private Set<ClientHandler> clients; //누구누구 있는지 확인 -> 서버에서 new할 때마다 넣어짐
    private PrintWriter out; //출력도 할거야. 서버한테 줄거야
    private BufferedReader in; //입력도 하고.
    private String userName;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) {
        this.socket = socket;
        this.clients = clients;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true); //true: 자동으로 flush(데이터 반영)해줌
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            out.println("아이디를 입력하세요: ");
            userName = in.readLine();
            broadcast("[" + userName + "] 님이 입장하셨습니다.");

            String msg;
            while ((msg = in.readLine()) != null) {
                if (msg.equalsIgnoreCase("/bye")) break;
                broadcast("[" + userName + "]: " + msg);
            }
        } catch (IOException e) {
            System.out.println("클라이언트 연결 종료: " + socket.getInetAddress());
        } finally {
            try {
                clients.remove(this);
                broadcast("[" + userName + "] 님이 퇴장하셨습니다.");
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void broadcast(String msg) {
        synchronized (clients) {
            for (ClientHandler ch : clients) {
                ch.out.println(msg);
            }
        }
    }
}
