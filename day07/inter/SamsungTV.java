package com.shinhan.day07.inter;

//사용법은 같아야 함 -> 사용법 정의:인터페이스
//TV interface를 구현한 class(SamsungTV)이다.
//여러 개의 인터페이스를 구현한 클래스
public class SamsungTV implements TV, Soundable{
	
	//SamsungTV만 가지고 있는 고유한!
	String company = "삼성";
	
	void samsungInfo() {
		System.out.println("Info: " + company);
	}
	
	//꼭 가져야 되는!
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " 전원을 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
		
	}

	@Override
	public void active() {
		TV.super.active();
		System.out.println("삼성이 재정의함");
	}
	
	@Override
	public void show() {
		System.out.println("samsung show");
	}

	@Override
	public void sound() {
		System.out.println("삼성 sound");
	}
	

	
}
