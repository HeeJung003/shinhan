package com.shinhan.day05;

public class OverloadingTest {
	public static void main(String[] args) {
		Calculator.add();
		new Calculator().add(1, 2, 3); //권장 X
		Calculator.add(1.2f, 2.2f, 3);
		Calculator.add('a',"b", "c");
		Calculator.add(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Calculator cal = new Calculator();
		int[] arr = {1, 2, 3, 4, 5}; //new int[] 생략 가능
		int result1 = cal.sum(new int[] {1,2, 3, 4, 5});
		int result2 = cal.sum(arr);
		
		int a = cal.display(10);
		System.out.println(a);
		
		System.out.println(Math.ceil(5.536)); //Math.ceil: 소수 아래 부분 버리고 무조건 올림 (반올림 X)
		System.out.println(Math.floor(4.222)); //Math.floor: 소수 아래 부분 다 버림 (반내림 X)
		
		//non-static 사용법
		new Calculator().f2(); //권장 X -> 변수, 메서드에 static을 붙여서 사용
		//static 사용법
		Calculator.f2();
	}
}

/*
 * 오버로딩의 조건
 * 
 * 1. 함수 이름이 같아야 
 * 2. 매개변수 타입과 개수 다르다 
 * 3. return타입은 상관없음
 */


class Calculator{
	
	//instance field(멤버변수) -> new 할 때마다 서로 다름
	String company;
	String color;
	
	//static field(class 변수)
	static int count;
	
	//instance method
	void f1() {
		
	}
	
	//static method
	static void f2() {
		
	}
	
	int display(int num) {
		if(num%2==0) {
			System.out.println("짝수");
			return num+1; //이 함수를 호출한 곳으로 돌아가. 아래 코드들 무시
			//System.out.println("return 아래 문장 작성 시 컴파일에러"); return 밑에 문장은 안 오니까 오류
		}
		System.out.println("홀수");
		return num+2;
	}
	
	int sum(int...arr) {
		int total = 0;
		for(int su:arr) {
			total += su;
		}
		System.out.println("total : " + total);
		return total;
	}
	
	static void add() { //static 붙이면 new 안 붙여도 됨
		System.out.println("add method--매개변수 없음");
	}
	
	void add(int a, int b, int c) { //static 안 붙이면 main에서 new 해야 됨
		System.out.println("int 3개 : " + (a+b+c));
	}
	
	static void add(double a, double b, double c) { //자동 형변환 가능
		System.out.println("int 3개 : " + (a+b+c));
	}
	
	static void add(char a, String b, String c) { //자동 형변환 가능
		System.out.println("char 1개, String 2개 : " + (a+b+c));
	}
	
	//가변길이
	static void add(int...arr) { 
		int sum = 0;
		for(int su:arr) {
			sum+=su;
		}
		System.out.println("sum : " + sum);
	}
}
