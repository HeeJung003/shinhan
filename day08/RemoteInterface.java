package com.shinhan.day08;

//람다표현식도 가능한가?
//람다표현식은 함수가 하나일 때만 가능
@FunctionalInterface
public interface RemoteInterface {
	
	String buttonClick(int a, int b);

}
