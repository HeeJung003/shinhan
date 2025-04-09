package com.shinhan.day05.Exercise;

//초기화 안 하고
//이렇게 쓸 수도 있음
public enum AcoountEnum {
	//기본은 0과 1인데
	//MIN_BALANCE는 0이었으면 좋겠어
	//MAX_BALANCE는 1000000이었으면 좋겠어
	MIN_BALANCE(0), MAX_BALANCE(1000000);
	
	int amount;
	AcoountEnum(int amount) {
		this.amount = amount;
	}
	
	int getAmount() {
		return amount;
	}
}
