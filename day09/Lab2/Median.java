package com.shinhan.day09.Lab2;

import java.util.Arrays;

public class Median {
	public static void main(String[] args) {
		Median median = new Median();
		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : " + Arrays.toString(values1));
		System.out.println("median : " + median.findMedian(values1));
		System.out.println("===============================");

		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : " + Arrays.toString(values2));
		System.out.println("median : " + median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		int result = 0;
		int median = 0;
		for (int a : values) {
			result += a;
		}
		result = result / values.length;

		System.out.println("평균: " + Math.abs(result)); // 절대값

		// value[i] - 평균이 가장 작을 값을 return 하고싶어
		// 만약에 value[i]-평균이 ( ) 보다 작으면 median에 넣어
		for (int i = 0; i < values.length; i++) {


			 System.out.print(Math.abs(values[i]-result) + " ");
			 int min = Math.abs(values[0]-result); //value[0]-평균을 임의로 넣음 -> 19
		
			if (min > Math.abs(values[i] - result)) {
				min = Math.abs(values[i]-result);
				System.out.println("min : " + min);
				  
				 //System.out.println("min : " + min);
				System.out.println("i :  " + i);
				//median = values[i];
				//System.out.println("fianl : " + values[i]);

			}else {
				System.out.println("ㅌX");
			}
			median = values[i];
		}

		return median;

	}
}
