package com.shinhan.day04.ch06;

public class Account {
	String accNo;
	int balance;
	
	//생성자
	Account() {}
	
	Account(String accNo, int balance) {
		//초기화
		this.accNo = accNo;
		this.balance = balance;
		print("계좌가 게설되었습니다.");
	}

	//일반 메서드
	void deposit(int amount) { //입금
		balance += amount;
		print("계좌에 " + amount + "원이 입급되었습니다.");
		
	}

	void withdraw(int amount) { //출금
		balance -= amount;
		print("계좌에 " + amount + "원이 출금되었습니다.");
	}
	
	String getAccNo() {
		return accNo;
	}
	
	int getBalance() {
		return balance;
	}
	
	void print(String message) {
		System.out.println(accNo + message);
		System.out.println(accNo + " 계좌의 잔고는 " + balance + "입니다.");
	}
	
}
