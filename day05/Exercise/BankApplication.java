package com.shinhan.day05.Exercise;

import java.util.Scanner;

public class BankApplication {
	
	Account20[] acc = new Account20[100];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//static이 static 아닌 애를 쓰려면 new
		BankApplication app = new BankApplication();
		
		boolean isContinue = true;
		while(true) {
			displayMenu();
			int job = app.sc.nextInt();
			
			switch(job) {
				case 1 -> {f_makeAccount(app);}
				case 2 -> {f_accountList(app);}
				case 3 -> {f_deposit(app);}
				case 4 -> {f_withdraw(app);}
				case 5 -> {isContinue = false;}
				default -> {
					System.out.println("1~5번까지만 입력");
				}
			}System.out.println("프로그램 종료");
		}

	}

	private static void f_withdraw(BankApplication app) {
		System.out.println("===출금===");
		System.out.print("계좌번호: ");
		String accNo = app.sc.next();
		System.out.print("출금금액: ");
		int amount = app.sc.nextInt();
		
		for(int i = 0; i < app.acc.length; i++) {
			if(app.acc[i] == null|| !app.acc[i].equals(accNo)) continue;
			app.acc[i].withdraw(amount);
			
			break;
		}
		
	}

	private static void f_deposit(BankApplication app) {
		System.out.println("===입금===");
		System.out.print("계좌번호: ");
		String accNo = app.sc.next();
		System.out.print("입금금액: ");
		int amount = app.sc.nextInt();
		
		for(int i = 0; i < app.acc.length; i++) {
			if(app.acc[i] == null|| !app.acc[i].equals(accNo)) continue;
			app.acc[i].deposit(amount);
			
			break;
		}
	}

	private static void f_accountList(BankApplication app) {
		for(Account20 acc :app.acc) {
			if(acc == null) {
				break;
			}else {
				System.out.print(acc);
			}
		}
	}

	private static void f_makeAccount(BankApplication app) {
		System.out.println("===계좌생성===");
		System.out.print("계좌번호 : ");
		String accNo = app.sc.next();
		System.out.print("계좌주 : ");
		String owner = app.sc.next();
		System.out.print("초기입금액 : ");
		int balance = app.sc.nextInt();
		
		Account20 acc = new Account20(accNo, owner, balance);
		
		for(int i = 0; i < app.acc.length; i++) {
			if(app.acc[i] == null) {
				app.acc[i] = acc;
				System.out.println("계좌가 생성됨");
				break;
			}
		}
	}

	private static void displayMenu() {
		System.out.println("===================");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("===================");
		System.out.print("선택 > ");
	}

}
