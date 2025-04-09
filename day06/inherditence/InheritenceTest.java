package com.shinhan.day06.inherditence;

public class InheritenceTest {

	public static void main(String[] args) {
		f3();
	}
	
	private static void f6() {
		BonusPointAccount acc1 = new BonusPointAccount("1234", "김", 1000, 10);
		System.out.println(acc1);
		acc1.deposite(2000);
		int amount = acc1.withdraw(3500);
		System.out.println(amount + "출금");
		System.out.println(acc1);
		
		
	}

	private static void f5() {
		CreditLineAccount acc1 = new CreditLineAccount("1234", "김", 1000, 500);
		System.out.println(acc1);
		
		acc1.deposite(2000);
		int amount = acc1.withdraw(3500);
		System.out.println(amount + "출금");
		
	}

	private static void f4() {
		CheckingAccount acc1 = new CheckingAccount("9999", "hong", 2000, "3434");
		System.out.println(acc1);
		
		acc1.deposite(1000);
		System.out.println("입금 : " + acc1.getBalance());
		int amount = acc1.withdraw(1000);
		System.out.println("출금 : " + acc1.getBalance());
		amount = acc1.pay("3434", 1000);
	}

	private static void f3() {
		Account acc1 = new Account("12324", "홍길동2", 2000);
		
		System.out.println(acc1);
	}

	private static void f2() {
		//account에서 기본생성자 안 만들면 오류남
		Account acc1 = new Account(); //객체 생성
		
		acc1.setAccNo("1234");
		acc1.setOwner("홍길동");
		acc1.setBalance(10000);
		
		System.out.println(acc1);
	}

	private static void f1() {
		//Child c1 = new Child();
		//Child c2 = new Child("조상호", 20);
		
		Child c3 = new Child("안가연", 20, 1000);
	}

}
