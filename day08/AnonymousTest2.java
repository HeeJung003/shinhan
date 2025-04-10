package com.shinhan.day08;

public class AnonymousTest2 {

	public static void main(String[] args) {
		//1. 구현 class 사용
		work(new RemoteA(), 10, 20);
		work(new RemoteB(), 10, 20);
		
		//2. 이름이 없는 익명 클래스
		work(new RemoteInterface() {
			@Override
			public String buttonClick(int a, int b) {
				// TODO Auto-generated method stub
				return "익명구현 class =="  + (a*b);
			}}, 10, 20);
	
		//2번이랑 같음 -> 람다표현식으로 사용함 -> 간단
		RemoteInterface f = (aa, bb)->"람다표현식 사용 -> " + (aa/bb);
		work(f, 10, 5);
	}
	
	public static void work(RemoteInterface remote, int su1, int su2) {
		String result = remote.buttonClick(su1, su2);
		System.out.println(result);
		System.out.println("-------------");
	}

}
