package com.shinhan.day06.inherditence;

public class BonusPointAccount extends Account {
	int bonusPoint;
	
	BonusPointAccount(String accNo, String owner, int balance, int bonusPoint){
		super(accNo, owner, balance);
		this.bonusPoint = bonusPoint;
	}
	
	void deposit(int amount) {
		//방법1. 직접 코드 구현
		//setBalance(getBalance() + amount);
		
		//방법2. 구현된 부모의 코드를 호출
		super.deposite(amount);
		bonusPoint += (int) (bonusPoint + amount * 0.001);
	}

	@Override
	public String toString() {
		return "BonusPointAccount [bonusPoint=" + bonusPoint + ", toString()=" + super.toString() + "]";
	}
	
	
}
