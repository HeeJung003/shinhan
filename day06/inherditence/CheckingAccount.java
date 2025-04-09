package com.shinhan.day06.inherditence;

//새로운 class: 기존 class와 유사
//상속받으면 부모가 변경시 자식에 반영됨
//수정, 추가 가능
//자식이 생성될 때 부모가 자동으로 생성됨 (super())

public class CheckingAccount extends Account {
	//추가필드
	String cardNo;
	

	public CheckingAccount(String accNo, String owner, int balance, String cardNo) {
		super(accNo, owner, balance);
		this.cardNo = cardNo;
	}

	//추가메소드
	int pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)) {
			return withdraw(amount);
		}else {
			System.out.println("카드번호 불일차");
			return 0;
		}
	}
	
	//추가메소드
	void info() {
		System.out.println("AccNo: " + getAccNo());
		System.out.println("owner: " + getOwner());
		System.out.println("balance: " + getBalance());
		System.out.println("cardNo: " + cardNo);
	}


	
	//부모가 가지고 있는 메서드를 재정의
	@Override
	public String toString() {
		return "CheckingAccount [cardNo=" + cardNo + ", 계좌번호, 예금주, 잔고 = " + super.toString() + "]";
	}
}
