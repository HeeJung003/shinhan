package com.shinhan.day08;

//인터페이스: 상수 + 추상메소드(정의 O, 구현 X(구현은 구현클르스가)) + 디폴드 메소드 + 정적 메소드 + private static mothed
//규격서 (규칙을 정하고 구현class가 규칙을 따르는 로직을 구현)
interface myInterface{
	public abstract void use();
}

class myClassA implements myInterface{

	@Override
	public void use() {
		System.out.println("구현class --- A");
	}
	
}

class myClassB implements myInterface{

	@Override
	public void use() {
		System.out.println("구현class --- B");
	}
	
}

//익명 구현 class
public class AnonymouseTest {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
	//익명 구현 클래스. 단지 변수에 담았을 뿐. f1을 호출했을 때 만든 것
		myInterface my1 = new myInterface() {
			public void use() {
				System.out.println("구현class --- c");
			}
		};
		myClassA my2 = new myClassA();
		myClassB my3 = new myClassB();

		
		work(my1);
		work(my2);
		work(my3);
		
//		work(new myInterface( ) {
//			public void use() {
//				System.out.println("구현class --- d");
//		}
//	};)
	
	//람다표현식
		myInterface my5 = () -> System.out.println("익명 구현 clas -f");};

	private static void work(myInterface mm) { //세가 다 받을 수 있게 만들어야 됨	
		mm.use();
		}
}
	
