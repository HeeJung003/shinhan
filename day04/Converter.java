package com.shinhan.day04;

import java.util.Arrays;

public class Converter {
	public static void main(String[] args) {
		System.out.println("문자열에 특정문자 변경하는 테스");
		System.out.println("-------------Sample 1 --------------");
		String str1=myReplace3("hello world",'l','*');
		System.out.println(str1);
		
		System.out.println("-------------Sample 2 --------------");
		String str2=myReplace3("hello world",' ','-');
		System.out.println(str2);
		
		System.out.println("-------------Sample 3 --------------");
		String str3=myReplace3("hello world",'a','*');
		System.out.println(str3);
		

	}
	
	//방법 1
	public static String myReplace(String str, char oldChar, char newChar){
		String result = " "; //새로운 문자 넣을 값
		for(int i = 0; i < str.length(); i++) {//한글자씩 돌음
			//문자열을 돌면서 글자를 바꿀 수는 없음
			//한 글자씩 
			//System.out.println(str.charAt(i)); //한 글자씩 나오는지 테스트
			if(str.charAt(i) == oldChar) {
				result += newChar;
			}else {
				result += str.charAt(i);
			}
		}
		return result; //void없으니까 return 해야 됨
	}
	
	//방법 2
	public static String myReplace2(String str, char oldChar, char newChar){
		String result = " "; //새로운 문자 넣을 값
		char[] charArr = str.toCharArray(); //
		//System.out.println(Arrays.toString(charArr));
		
		for(int i = 0; i < str.length(); i++) {//한글자씩 돌음
			
			if(str.charAt(i) == oldChar) {
				charArr[i] = newChar;
			}else {
				charArr[i] = str.charAt(i);
			}
		}
		result = new String(charArr); //charArr를 문자열로 바꿔줌. charrArr는 char인데 result는 String으로 반환하니까
		return result; //void없으니까 return 해야 됨
	}
	
	//방법 3
	public static String myReplace3(String str, char oldChar, char newChar){
		String result = str.replaceAll(oldChar+"", newChar+"");
		
		return result; //void가 없으니까 return 해야 됨
		

	}
	
	
}
