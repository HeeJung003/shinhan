package com.shinhan.day05.Exercise;

public class Account20 {
	private String accNo; //계좌번호
	private String owner; //계좌주
	private int balance;
	
	public Account20() {
		this(null, null, 0);
	}

	
	public Account20(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	
	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	void deposit(int amount) { //입금
		balance+=amount;
	}
	
	int withdraw(int amount) {
		if(balance >= amount) {
			System.out.println("출금 성공");
			balance -= amount;
			return amount;
		}else {
			System.out.println("잔고부족, 출금 실패");
			return 0;
		}
	}


	@Override
	public String toString() {
		return "Account20 [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	
	
	
	
	
}
