package com.shinhan.day06.inherditence;

import com.shinhan.day06.inherditence.vehicle.*;

//중요!
public class InheritenceTest2 {

	public static void main(String[] args) {
		call3();

	}

	private static void call3() {
		//다 담고싶으면 account로 받음
		//자식이 부모에 담길 수 있음
		//자동 형변환: 부모의 타입에 자식의 객체가 들어갈 수 있음. 부모의 공통적인 코드를 사용함
		Account[] arr = new Account[4];
		arr[0] = new Account("123", "박", 2000);
		arr[1] = new BonusPointAccount("123", "김", 1000, 100);
		arr[2] = new CheckingAccount("124", "양", 3000, "999");
		arr[3] = new CreditLineAccount("125", "정", 3000, 2000);
		
		for(Account acc:arr) {
			acc.deposite(1);
			int amount = acc.withdraw(100);
			System.out.println("출금 : " + amount);
			System.out.println("잔고 : " + acc.getBalance());
			System.out.println(acc); //사용법은 같지만 결과가 다름 -> 오버라이딩
			
			//부모가 자식한테 갈 수 없음 - 강제 형변환
			//자식타입 = (자식타입)부모타입
			//단, 부모객체가 자식 타입으로 만든 객체일 때만 가능
			//checkingAccount로 만든 것만 가능
			
			if(acc instanceof CheckingAccount) {
				CheckingAccount card = (CheckingAccount)acc;
				int aa = card.pay("000", 500);
				System.out.println("카드번호로 출금 : " + aa);
			}
			
			
			
			System.out.println("==============");
		}
	}

	private static void call2() {
		Vehicle arr[] = new Vehicle[3];
		
		arr[0] = new Car("abc승용차", 100, 15);
		arr[1] = new Bus("시내버스", 100, 40);	
		arr[2] = new Truck("트럭", 90, 5000);
				
		//Car car = new Car("abc승용차", 100, 15);
		//Bus bus = new Bus("시내버스", 100, 40);	
		//Truck truck = new Truck("트럭", 90, 5000);
		
		//이렇게도 가능
		//Vehicle car = new Car("abc승용차", 100, 15);
		//Vehicle bus = new Bus("시내버스", 100, 40);	
		//Vehicle truck = new Truck("트럭", 90, 5000);
		
		//print(car);
		
		for(Vehicle v:arr) {
			print(v);
		}
	}
	
		//1. 참조형 자동형변환 : 부모타입 = 자식객체
	public static void print(Vehicle v) {
		v.info();
		v.start();
		v.stop();
		
		
		//2. 참조형 강제형변환 : 자식타입 = (자식타입)부모객체 단, 부모객체의 본래의 instance가 자식이었을 때만 가능 
		//버스인 것만 버스로 바꿀 수 있음
		//버스이면 b.info2()로
		if(v instanceof Bus) {
			Bus b = (Bus)v;
			b.info2();
		}
	}

	private static void call() {
		//1. 기본형 자동형변환 : 큰 방 = 작은 방		
		int i = 100;
		double j = i;
		System.out.println(i + " : " + j);
		
		//2. 기본형 강제형변환 : 작은 방 = (작은방타입) 큰 방
		i = (int)j;
		System.out.println(i + " : " + j);
	}

}
