package com.shinhan.day03;

import java.util.Arrays;

public class ArrayTest2 {

	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		int[] arr = new int[] {10, 20, 30};
		int[] arr2 = arr; //arr1 주소를 arr2에 넣음. 같은 주소를 가리키고 있음. 복사 X
		
		int[] arr3 = new int[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr3.length); //배열 복사
		
		arr2[0] = 00; //arr3은 영향을 받지 않음
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
	}

	private static void f5() {
		String[][] arr1 = new String[][] {{"a", "b"}, {"C", "c"}};
			//향상for문, 확장for문
			for(String[] chArr:arr1) {
				for(String ch:chArr) {
					System.out.printf("%3s", ch);
				}
				System.out.println();
			}
		}
		

	private static void f4() {
		boolean[][] arr1 = new boolean[3][4]; //{{true, false}, {true, false, false, true, true}}; //2행
		
		for(boolean[] boArr:arr1) {
			for(boolean bo:boArr) {
				System.out.printf("%10s", bo);
			}
			System.out.println();
		}
		
	}

	private static void f3() {
		char[][] arr1 = new char[][] { {65, 66, 67, 68}, {'가', '6', '7', '8'}, {'a', 'b','c'}};
		
		//향상for문, 확장for문
		for(char[] chArr:arr1) {
			for(char ch:chArr) {
				System.out.printf("%3s", ch);
			}
			System.out.println();
		}
			
		
	}

	private static void f2() {
		char[][] arr1 = new char[][] { {65, 66, 67, 68}, {'가', '6', '7', '8'}, {'a', 'b','c'}}; //초기값 줌. 3행4열
		
		for(int i = 0; i <arr1.length; i++) {
			for(int j = 0; j <arr1[i].length; j++) {
				System.out.printf("%3s", arr1[i][j]);
			}
			System.out.println();
		}
	}

	private static void f1() {
		// 2차원배열 -> 배열의 배열
		//1. 배열참조변수 선언
		//2. 배열생성
		//3. 배열사용
		
		int[][] arr1; //선언
		int[] arr2[] = new int[4][]; //선언+초기화
		int arr3[][]; //선언
		
		arr1 = new int[3][4]; //생성. 배열의 길이(arr1.length):3, | arr1[0].length:4
		System.out.println("배열의 길이: " + arr1.length); //3
		System.out.println("배열의 배열길이: " + arr1[0].length); //4
		System.out.println("값: " + arr1[0][0]);
		
		System.out.println("--------------");
		arr2[0] = new int[] {10, 20, 30};
		arr2[1] = new int[] {1, 2, 3, 4}; //new int[] 생략 불가능
		arr2[2] = new int[] {1, 2};
		arr2[3] = new int[] {1, 2, 3, 4, 5, 6};
		
		//System.out.println(arr2[2][4]); //error 5열없음
		
		for(int row = 0; row < arr2.length; row++) {
			for(int col = 0; col < arr2[row].length; col++) {
				System.out.printf("%3d", arr2[row][col]);
			}
			System.out.println();
		}
		
	}

}
