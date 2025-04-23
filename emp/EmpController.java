package com.shinhan.emp;

import java.util.List;
import java.util.Scanner;

public class EmpController {
	
	static Scanner sc = new Scanner(System.in);
	static EmpService empService = new EmpService(); //EmpService에 있는 함수들은 static이 아님 -> new 해야 됨
	
	
	public static void main(String[] args) {
		
		boolean isStop = false;
		while(!isStop) {
			menuDisplay();
			int job = sc.nextInt();
			switch(job) {
			case 1 -> {f_selectAll();}
			case 2-> {}
			case 9 -> {isStop = true;}
			}
		}
		System.out.println("the end");
	}


	private static void f_selectAll() {
		//empService에 있는 selectAll을 가져올거고 
		//그게 list로 EmpDTO type이야
		//그걸 emplist로 받을거야
		List<EmpDTO> emplist = empService.selectAll();
		EmpView.display(emplist);
		
	}


	private static void menuDisplay() {
		System.out.println("--메뉴--");
		System.out.println("1. 모두 조회 || 2. 직원번호로 조회 || 9. 끝");
		System.out.println("------");
		
		System.out.println("입력 : ");
		
	}
}
