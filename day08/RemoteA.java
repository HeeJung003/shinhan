package com.shinhan.day08;

public class RemoteA implements RemoteInterface {

	//구현클래스 -> 자주 써야 효율
	@Override
	public String buttonClick(int a, int b) {	
		return "구현class RemoteA = " + (a+b);
	}

}
