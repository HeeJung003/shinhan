package com.shinhan.day07.inter;

interface InterA{
	void call1();
}

interface InterB{
	void call2();
}

//interface는 다중상속 가능
interface InterC extends InterA, InterB{
	void call3();
}

//implements InterC : InterC를 참고하고있다
class MyImpl implements InterC {

	@Override
	public void call1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call3() {
		// TODO Auto-generated method stub
		
	}
	
}


//interfaceA는 이러한 규칙을 지켜야돼!!
interface InterfaceA {
	public abstract void f1();
	void f2();

}

//interfaceB는 이러한 규칙을 지켜야돼!!
interface InterfaceB {
	void f3();
	void f4();
}

abstract class ParentClass {
	public abstract void f5();
}

//abstract으로 하면 안되나 -> 할 수는 있으나 class는 다중상속이 불가 -> 그래서 interface(class는 다중interface가능)
//추상메소드는 구현클래스가 반드시 구현할 의무가 있음
class FirstZoneService extends ParentClass implements InterfaceA, InterfaceB {

	@Override
	public void f3() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f5() {
		// TODO Auto-generated method stub

	}

}

public interface InterfaceTest {
	public static void main(String[] args) {
		f2();

	}

	public static void f2() {
		FirstZoneService v1 = new FirstZoneService();
		//자동형변환
		ParentClass v2 = new FirstZoneService();
		InterfaceA v3 = new FirstZoneService();
		InterfaceB v4 = new FirstZoneService();
		
		work(v1);
		//work(v2);
		work(v3);
		//work(v4);
	}

	//자동형변환(부모 = 자식)
	public static void work(InterfaceA service) {
		//work(v1), work(v3)만 가능
		//FirstZoneService랑 InterfaceA만 가능
		//InterfaceB, ParentClass는 불가능! 관련없는 것임
		//다 들어가면 좋겠다 -> public static void work(Object service) 
		//-> 근데 Object 안에 있는 것만 볼 수 있음 -> FirstZoneService?ParentClass?InterfaceA?InterfaceB? 다 물어봐야 됨
	}
	

	public static void f1() {
		FirstZoneService n1 = new FirstZoneService();
		n1.f1();
		n1.f2();
		n1.f3();
		n1.f4();
		n1.f5();
		
		ParentClass n2 = new FirstZoneService();
		//형변환하면 볼 수 있지만 지그믕ㄴ parentClass에 있는 것만 볼 수 있음
		//n2.f1(); 안 됨
		//n2.f2();
		//n2.f3();
		//n2.f4();
		n2.f5();
		
		InterfaceA n3 = new FirstZoneService();
		//형변환하면 볼 수 있지만 지금은 InterfaceA에 있는 것만 볼 수 있음
		n3.f1();
		n3.f2();
		
		if(n3 instanceof FirstZoneService first) {
			first.f3();
			first.f4();
			first.f5();
		}
		
	}
}
