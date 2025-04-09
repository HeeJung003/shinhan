package com.shinhan.day07.inter;

public class LgTV implements TV, Soundable{

	//LG만 가지고 있는 고유한!
	String company2 = "LG";
	
	void display() {
		System.out.println("display : 화질");
	}
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
		System.out.println("Lg가 재정의");
	}
	@Override
	public void show() {
		System.out.println("LG show");
	}
	
	@Override
	public void sound() {
		System.out.println("LG sound");
	}


}
