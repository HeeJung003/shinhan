package com.shinhan.day05.Exercise;


public class MemberService {
	String id;
	String password;
	
	//메서드
	boolean result = true;

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃되었습니다.");
	}

}
