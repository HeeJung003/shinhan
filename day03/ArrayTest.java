package com.shinhan.day03;




public class ArrayTest {

	public static void main(String[] args) {
		//명령행 매개변수 -> 명령줄에서 실행 시 이 프로그램에 들어오는 argument

		//명령행 매개변수로 두 정수를 입력받아 더하기 수행하기
		
		if(args.length != 2) {
			System.out.println("매개변수로 2개의 정수를 입력하세요");
			return; //자바가상머신으로 돌아감. 프로그램 종료
		}
		
		int su1 = Integer.parseInt(args[0]); //지금 args에 할당된 게 없으니까 null -> 오류
		int su2 = Integer.parseInt(args[1]);
		
		System.out.printf("%d + %d = %d",su1, su2, su1+su2);
		
		//f4();

	}

	private static void f4() {
		String[] arr = {"자바", "DB", "web", "FW"}; //new int[] 생략가능
		
		//향상for, 확장for => 값이 여러개 있을 때 유용
		for(String s:arr) {//반복자(iterator)를 이용
			System.out.println(s);
		}
	}

	private static void f3() {
		//선언+생성+초기화
		int[] arr1 = new int[] {1, 2, 3, 4, 5}; //배열의 개수를 적지 않아야 한다. 
		int[] arr2 = {1, 2, 3, 4, 5};
		
		int[] arr3;
		arr3 = new int[] {1, 2, 3, 4, 5}; //new int[]부분 생략 불가능
	
	}

	private static void f2() {
		//선언+생성
		int[] arr1 = new int[5]; // {0, 0, 0, 0, 0}
		
		//사용
		arr1[0] = 100;
		for(int i = 0; i <arr1.length; i++) { //배열의 길이는 length 속성을 이용한다.(함수 X)
			System.out.println(arr1[i]);
		}

	}

	private static void f1() {
		//배열: 같은 타입, 값 여러개, 연속공간, 접근은 첨자이용
		//1. 배열참조변수선언
		int[] arr1=null;
		char arr2[];
		//선언+생성
		double[] arr3 = new double[3];
		boolean[] arr4 = new boolean[3];
		
		//2. 배열생성 -> 초기화하지 않은 변수는 사용할 수 없음. 생성하지 않으면 사용 불가능. 생성할 때 반드시 배열의 개수를 정한다.
		arr1 = new int[3]; //3개의 int 저장 가능한 연속공간을 만든다. 자동초기화 됨
		arr2 = new char[3];
		//정수 -0으로 초기호
		//실수 -0.0으로 초기화
		//boolean -false로 초기화
		//char -' '으로 추기화
		
		
		//3. 배열사용
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr4[0]);
		
	}

}
