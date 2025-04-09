package com.shinhan.day02;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		//f5();
		//hokeyGraphics('$', 4, false);
		hokeyGraphics('@', 5, false);
	}



	private static void f5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수 : ");
		int line = sc.nextInt();
		
		for(int i = line; i >= 1; i--) {
			for(int j = 1; j <=line; j++) {
				System.out.print("*");
			}
			System.out.println();
			line--;
		}
	}
	
	
    public static void hokeyGraphics(char cell, int size, boolean isRect)
    {
        if(isRect == true) { //사각형 모양
        	for(int row = 1; row <= size; row++) {
        		for(int col = 1; col <= size; col++) {
        			System.out.print(cell);
        		}
        		System.out.println();
        	}
        }else {
        	for(int row = 1; row <= size; row++) {
        		for(int col = 1; col <= row; col++) {
        			System.out.print(cell);
        		}
        		System.out.println();
        	}
        }
    }


	private static void f3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt(); 
		int total = 0; //총합
		
		if(num%2==0) {//num이 짝수이면
			for(int i = 0; i <=num; i+=2) {
				total += i;
				//System.out.print(i + " ");
			}
		}else {//num이 홀수이면
			for(int i = 1; i <= num; i+=2) {
				total += i;
				//System.out.print(i + " ");
			}
		}
		
		System.out.println("결과 값 : " + total);
		
	}
	

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String word = sc.nextLine();
		word = word.toUpperCase();
	
		for(int i = 1; i < word.length()+1 ; i++) {
			System.out.println(word.substring(0,i));
		}
		
	}

	private static void f1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초기값을 정수로 입력하세요 : ");
		int start = sc.nextInt(); //초기값 입력받음
		System.out.print("마지막 값을 정수로 입력하세요 : ");
		int end = sc.nextInt(); //마지막 값 입력받음
		System.out.print("증가분을 정수로 입력하세요 : ");
		int step = sc.nextInt(); //증가분 입력받음
		
		int total = 0; //총합
		
		for(int i = start; i <= end; i+=step) {
			total += i;
		}
		
		//합을 구한 결과가 1000이 넘으면 결과에 2000 더하기
		if(total >= 1000) {
			System.out.printf("총합은 %d 입니다.", total+2000);
		}else {
			System.out.printf("총합은 %d 입니다.", total);
		}
	}
}
