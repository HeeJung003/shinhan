package com.shinhan.day09.Lab;


public class CellPhone {
	private String model;
	private double battery;

	CellPhone(String model) {
		this.model = model;
	}

	// RuntimeException은 자동으로 던져짐
	void call(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("통화시간 입력 오류");
		}

		System.out.printf("통화시간 : %d분\n", time);
		battery -= time * 0.5;
		if (battery < 0)
			battery = 0;

	}

	void printBattery() {
		System.out.printf("남은 배터리 양 : %3.1f\n", battery);
	}

	void charge(int time) {
		if (time < 0)
			throw new IllegalArgumentException("충전시간입력오류");
		System.out.printf("충전시간 : %d분\n", time);
		battery += time * 3;
		if (battery > 100)
			battery = 100;
	}

	// 지금은 재정의해야됨 (재정의 overring: 이름, 매개변수, return 같아야 함)
	@Override
	public boolean equals(Object obj) {
		//if(model.equals(obj)) //obj 안에 model 없어서 안됨 -> 형변환
		
		if(!(obj instanceof CellPhone)) return false; //형변환할 때 그게 CellPhone에 있는지 확인!!
		CellPhone otherCellPhone = (CellPhone)obj; // obj를 CellPhone으로 형변환
		if(model.equals(otherCellPhone.model)) return true;
		return false;
	}

}
