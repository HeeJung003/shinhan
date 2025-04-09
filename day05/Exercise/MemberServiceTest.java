package com.shinhan.day05.Exercise;

public class MemberServiceTest {

	public static void main(String[] args) {
		System.out.println("=====15번=====");
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		System.out.println("=====16번=====");
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");

	}

}
