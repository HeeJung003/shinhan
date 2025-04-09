package com.shinhan.day03;

import java.util.Arrays;

public class Exercise {

	public static void main(String[] args) {
		f9();

	}

	private static void f9() {
	
	}

	private static void f8() {
		int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int count = 0;
		int sum = 0;
		
//		for(int[] arr:array) {
//			for(int score:arr) {
//				count++;
//				sum+=score;
//			}
//		}
//		
//		System.out.println("총점1: " + sum);
//		System.out.println("평균1: " + (double)sum/count);
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				count++;
				sum += array[i][j];
			}
		}
		
		System.out.println("총점2: " + sum);
		System.out.println("평균2: " + (double)sum/count);
		
		
	}

	private static void f7() {
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			//max = Math.max(max, array[i]);
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
		
	}

	private static void f1() {
		int a = 100; //기본형은 stack에 메모리에 저장됨
		//int b = null; //기본형은 null 할당 불가
		String s = "java"; //자바는 힙, 변수는 스택 -> 참조변수는 stack에 메모리에 저장됨. 생성된 객체는 heap에 만들어짐
	}

}
