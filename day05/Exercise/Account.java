package com.shinhan.day05.Exercise;

public class Account {
	private int balance; //잔고
	//상수(staitc final)는 반드시 선언시 초기화한다.
	//Account에서 사용된 상수가 만약에 관련 class들에서 동일한 값을 쓴다면 enum 권장
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	

	//getter,setter
	int getBalance() {
		return balance;
	}

	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		
		}
	}
}

