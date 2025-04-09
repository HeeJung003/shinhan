package com.shinhan.day02;

import java.util.Scanner;

//static은 static만 호출 가능

public class Lab2 {

	public static void main(String[] args) {
		f8();
//		int year = 2020, month = 4;
//		int lastDay = numDays(year, month); //인자, 파라미터, 아규먼트
//		System.out.printf("%d년도의 %d월의 말일은 %d입니다.", year, month, lastDay);
		
		//f6(year, month);
		
	}

	//최대공약수
	//최대공약수 개념 부족
	private static void f8() {
		
		Scanner sc = new Scanner(System.in); 
		sc.useDelimiter("[,\\s]"); //구분자를 콤마로 함 => 10,5, 이렇게 줘야 구분함 
		//[]를 써서 선택으로 바꿈 
		//\\s: 공백, 엔터, 탭 가능
		//기본은 구분자가 공백
		System.out.print("숫자입력 : ");
		
		int su1 = sc.nextInt(); //기본은 구분자가 공백 -> 콤바로 구분하고 싶음 => "스캐너는 구분자가 콤마입니다." 알려줘야 됨
		int su2 = sc.nextInt();
		
		//둘 중에 작은 수 먼저 구하기
		//int min = su1>su2?su1:su2;
		int min = Math.min(su1, su2);
		
		int result = 1;
		for(int i = min; i >= 1; i--) {
			if(su1%i == 0 && su2%i == 0) {
				result = i; break;
			}
		}
		System.out.println(result); 
		sc.close();
		
	}

	//7번_인자 값에 해당하는 월의 날짜 수 반환
	private static int numDays(int year, int month) {
		
		int lastDay;

		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				lastDay = 31;
			}
			case 4, 6, 9, 11 -> {
				lastDay = 30;
			}
			case 2 -> {
				lastDay = 28;
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					lastDay = 29;
			}
			default -> {
				System.out.println("월이 잘못 입력되었습니다.");
				lastDay = 0;
			}
		}
		
		return lastDay;
	}


	//윤년
	private static void f6(int year, int month) {
		int lastDay = numDays(year, month);

		System.out.printf("%d년도의 %d월의 말일은 %d입니다.", year, month, lastDay);
	}

	//1부터 시작해서 두 항의 차이가 1씩 증가
	//다시
	private static void f5() {
		int num = 1; //각각의 수, 1부터 시작
		int num2 = 1; //증가치
		int total =0;
		
		for(int i = 1; i <=15; i++) {
			total += num;
			num += num2;
			num2++;
		}
		System.out.println("15번째까지의 합: " + total);
	}

	//임의의 정수를 받아서 1000까지 정수의 배수 개수, 배수의 합
	private static void f4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int su = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i%7==0) {
				count = count +1;
				sum = sum + i;
			}
		}
		System.out.printf("%d의 배수 개수 : %d \n", su, count);
		System.out.printf("%d의 배수 합: %d", su, sum);
		
		sc.close();
	}

	//팩토리얼
	//result = 1 안 해서 1시간 고민함
	private static void f3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요 : ");
		int num = sc.nextInt();
		int result = 1;
		
		if(num < 2 || num > 9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				result *= j;
				//System.out.println(i + " " + j + "= " + result);
				//System.out.printf("%d! = %d\n", i, result);
			} 
			
			System.out.printf("%d! = %d\n", i, result);
			result = 1;
		}
		sc.close();	
		
}
		
	//}

	//소수인지 여부를 판별하는 프로그램
	//소수 개념 부족했음
	  private static void f2() { 
		  Scanner sc = new Scanner(System.in);
		  System.out.print("2~100 사이의 정수를 입력하세요 : "); 
		  int num = sc.nextInt();
	  
		  boolean isPrime = true; //나는 소수야. 임의 선언
		  //자기 자신으로 나누어 떨어지면 소수
		  //1. 자기 자신으로 나누어 떨어지니까 조건을 int i = 2; i <= num-1;
		  for(int i = 2; i <= num-1; i++) {
			  if(num%i == 0) { //다른 수로 나누어 떨어지면 
				  isPrime = false; //소수X
				  break;
			  }
		  }
		  System.out.println(isPrime?"소수":"소수X");
		  sc.close();
	 }
	 

	//구구단
	private static void f1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) { //2보다 작거나 9보다 큰 정수가 입력될 경우
			System.out.println("잘못된 숫자가 입력되었습니다.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", num, i, num*i);
			}
		} sc.close();
	}
	
}
