package com.shinhan.day02;

import java.util.Scanner;

//반복문
//for while do~while
public class LoopingTest {

	public static void main(String[] args) {
		f15();
	}

	
	private static void f15() {
		boolean isExit = false; //label을 써도 되지만, 코드가 안 이쁘니까 이렇게 설정
								//while할 때 true가 될 때까지 돌거야
		int balance = 0; //잔고
		
		Scanner sc = new Scanner(System.in);
		while(!isExit) {
			menuDisplay();
			int select = sc.nextInt();
			
			switch(select) {
			case 1 -> {
				System.out.print("예금액> ");
				int amount = sc.nextInt();
				balance += amount;
			}
			case 2 -> {
				System.out.print("출금액> ");
				int amount = sc.nextInt();
				if(balance < amount) {
					System.out.println("출금 불가");
					continue;
				}else {
					balance -= amount;
				}
			}
			case 3 -> {
				System.out.printf("잔고> %d", balance );
				System.out.println();
				
			}
			case 4 -> {isExit = true;}
			default-> {
				System.out.println("지원되지 않는 업무입니다.");
			}
			}
		}
		
	
		
		
		
	}
	
	private static void menuDisplay() {
		System.out.println("--------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 |4. 종료");
		System.out.println("--------------------------------");
		System.out.print("선택> ");
		
	}


	private static void f14() {
		//연습문제3_6_3
		for(int i = 1; i <=5; i++) { //5줄
	
			for(int k = 1; k <=6-i; k++) {
				System.out.print(" ");
			}
			for(int k = 6-i; k <= 5; k++) {
				System.out.print("*");
			}
			
			System.out.println("" );
		}
	}
// 0000* 4 1
// 000** 3 2
// 00*** 2 3

	private static void f13() {
		//연습문제3_6_2
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void f12() {
		//연습문제3_6_1
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void f11() {
		//연습문제3_5
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <=10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("( %d , %d )", x, y);
				}
			}
		}
	}

	private static void f10() {
		//추가문제_로또번호
		double num1 = (int)Math.random()*45+1;
	}

	private static void f9() {
		//연습문제3_4 
		//while 문과 Math.random() 메소드를 이용해서 
		//나오는 눈을 (눈1, 눈2) 형태로 출력하고, 
		//눈의 합이 5가 아니면 계속 주사위를 던지고, 
		//눈의 합이 5이면 실행을 멈추 는 코드를 작성해보세요. 
		//눈의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.

		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			if(dice1+dice2 == 5) {
				System.out.printf("( %d , %d )", dice1, dice2);
				break;
			}
		}
	}

	private static void f8() {
		//연습문제3_3
		//for문을 이용해서 1~100까지 정수 중 3의 배수의 총합을 출력하는 코드
		int su;
		int total = 0;
		for(su = 1; su <=100; su++) { //loop 횟수를 봤을 떄 100번 도는 거니까 엄청 좋은 코드는 아님
			if(su%3==0) {
				total+= su;
			}
		}
		System.out.println(total);
	}

	private static void f7() {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A" -> {score1 = 100;}
		case "B" -> {int result = 100 - 20; score1 = result;}
		default->{score1 = 60;}
		}
		System.out.println(score1);
	}



	private static void f6() {
		// double data = 12.92; //switch문에서 사용할 수 있는 변수의 타입은 double은 불가(정확하게 나타낼 수 없음).
		// String은 가능
		int data = 10;
		switch (data) {
		case 10:
			System.out.println("합격");
			break;
		default:
			System.out.println("불합격");
			break;
		}
	}

	private static void f5() {
		labelA: for (int gop = 1; gop < 10; gop++) {
			for (int dan = 2; dan < 10; dan++) {
				// if(dan == 4) continue;
				if (dan == 4)
					break labelA;
				System.out.printf("%d * %d = %d\t", dan, gop, dan * gop);
			}
			System.out.println();
		}

	}

	private static void f4() {
		for (int i = 1; i <= 12; i++) { // i가 1부터 조건식(i<=10)이 참인동안 하나씩 증가하면서
			// if(i % 5 == 0) break; //조건이 맞으면 반복중단
			if (i % 5 == 0)
				continue; // 아래문장은 무시하고 반복은 계속
			System.out.print(i + " ");
		}

	}

	private static void f3() {
		int su = 1;
		int total = 0;
		do {
			System.out.print(su + " ");
			total += su;
			su++;
		} while (su <= 10);

		System.out.println();
		System.out.println("while문 종료 후 su = " + su);
		System.out.println("total = " + total);
	}

	private static void f2() {
		int su = 1;
		int total = 0; // 초기화!
		while (su <= 10) {
			total += su;
			System.out.print(su + " ");
			su++;
		}

		System.out.println();
		System.out.println("while문 종료 후 su = " + su);
		System.out.println("total = " + total);

	}

	private static void f1() {
		int su;
		int total = 0; // 초기화!
		for (su = 1; su <= 10; su++) {
			total += su;
			System.out.print(su + " ");
		}
		System.out.println();
		System.out.println("for문 종료 후 su = " + su);
		System.out.println("total = " + total);
	}
}
