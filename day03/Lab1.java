package com.shinhan.day03;

import java.util.Arrays;

public class Lab1 {

	public static void main(String[] args) {
		//f1();
		int[][] arr1 = {{30, 30, 30, 30}, {40, 40, 40, 40}, {50, 50, 50, 50}}; 
		int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] arr3 = new int[3][4]; //초기화 -> 0으로
		sub(arr1, arr2, arr3);
		
		prn(arr1);
		prn(arr2);
		prn(arr3);
	}
	
	public static int[][] sub(int[][] a, int[][] b, int[][] c){
		//arr1 - arr2 = arr3
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j <b.length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
 		}	
		return c; //void없음 : return 할건데 뭘 해야할지 모르겠어 -> 일단 null
	}
	
	public static void prn(int[][] arr2) {
		//void: return없음을 의미
		System.out.println("----------");
		for(int[] arr1:arr2) {
			System.out.println(Arrays.toString(arr1));
		}
	}

	//selectSorting
	private static void f1() {
		int[] arr1 = new int[] {3, 24, 1, 55, 17, 43, 5};
		System.out.println("before:" + Arrays.toString(arr1));
		
		for(int i = 0; i < arr1.length-1; i++) { //[0]부터 [6]까지 할건데, [6]은 할 필요없음. 왜? [5]까지 하면 [6]은 나오니까
			for(int j = i+1; j < arr1.length; j++) { //[0]일 때 [6]까지 돌면서 확인할거야
				if(arr1[i] > arr1[j]) { // 돌고있는 j가 더 작으면 i자리로 바꿔야지
					//자리바꾸기
					int temp = arr1[i];
					arr1[i]= arr1[j];
					arr1[j] = temp;
				}
			}
			System.out.println("modify: " + Arrays.toString(arr1));
		}
		System.out.println("after: " + Arrays.toString(arr1));
	}

}
