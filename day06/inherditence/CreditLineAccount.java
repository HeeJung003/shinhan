package com.shinhan.day06.inherditence;

public class CreditLineAccount extends Account {
	//field 추가
	int creditLine;
	
	//생성자 추가
	CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance);
		this.creditLine = creditLine;
	}
	
	//출금하다 재정의할거야
	//부모가 정의한 메서드를 다시 구현
	//메서드 이름, 매개변수 개수, 타입, return 같아야 됨
	//단) 접근제한자는 같거나 같아야 됨
	//처음에 생략이었으니까 protected 또는 public 가능
	@Override //컴파일러가 해석한다. annotation
	public int withdraw(int amount) {
		if(getBalance()+creditLine < amount) {
			System.out.println("출금 불가");
			return 0;
		}
		setBalance(getBalance()- amount);
		return amount;
	}

	@Override
	public String toString() {
		return "CreditLineAccount [creditLine=" + creditLine + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
