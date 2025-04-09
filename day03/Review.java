package com.shinhan.day03;

public class Review {

	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		//반복문: for, while, do-while(조건을 나중에 체크, 한번은 꼭 해야 될 때)
		
		//1. for
		for(int i = 1 ; i<=5; i++) {
			System.out.println(i);
		}
		
		//2. while
		int i = 1;
		while(i<=5) {
			System.out.println(i);
		}
		
		//3. do~while
		
		
	}

	private static void f1() {
		//조건문: 3항연산자이용, if, switch, 
		
		//입력된 숫자가 짝수인지, 홀수인지
		//1. 3항연산자
		int su = 10;
		String result = su%2 == 0?"짝수":"홀수";
		
		//2. if
		String result2;
		if(su%2 == 0) {
			result2 = "짝수";
		}else {
			result2 = "홀수";
		}
		
		//3. switch
		String result3="";
		switch(su%2) {
		case 0:result3 = "짝수"; break;
		case 1:result3 = "홀수"; break;
		}
		
	}

}
