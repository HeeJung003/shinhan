package com.shinhan.day04;

import java.util.Arrays;

public class Spliting{
	public static void main(String[] args) {
		Spliting p = new Spliting();
		String addr = "서울시,강남구,역삼동,삼성SDS멀티캠퍼스";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}		
	}

	public String[] split(String str, char separator){
		//돌다가 separator을 만나면 전에꺼 배열에 넣고 초기화 =
		String[] result = null;
		
		//배열은 반드시 개수를 알아야 만들 수 있음! > ,의 개수를 알아야 됨 > ,+1 만큼 배열을 만들어야 됨
		int count = 0; // ,의 개수
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == separator) {
				count++;
			}
		}

		//배열 만들기
		result = new String[count+1];
		String word = ""; //한 단어를 찾으려고
		//배열의 인덱스를 생각할 때 index 만들어서 증가시키기. 그냥 i를 증가시키면? 이라고 생각했음
		int index = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == separator) {
				result[index] = word;
				word = ""; //단어 초기화
				index++; //배열 0 -> 1 -> 2 -> 3
			}else {
				word += str.charAt(i);
			}
		}
		result[index] = word; //,를 만나지 못 한 마지막 단어 출력
		return result;
	}
}
