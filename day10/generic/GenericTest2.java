package com.shinhan.day10.generic;

import lombok.AllArgsConstructor;

//p.586
class Person{}
class Worker extends Person{}
class Student extends Person{}
class HighStudent extends Student{}
class MiddleStudent extends Student{}

//제네릭class
@AllArgsConstructor
class Applicant<T>{
	T kind;
}

//와일드카드(?) 타입 파라메타
//? : 아무거나 가능 (Object)
//? extends Student : student와 student를 상속받은 하위만 가능
//super Worker: worker와 worker 의 상위로만 가능 (Person)
class Course{
	public static void registerCour(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "...registerCourese");
	}
	public static void registerCour2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "...registerCourese2");
	}
	public static void registerCour3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "...registerCourese3");
	}
	
}

public class GenericTest2 {

	public static void main(String[] args) {
		Applicant<Person> app1 = new Applicant<>(new Person());
		Applicant<Worker> app2 = new Applicant<>(new Worker());
		Applicant<Student> app3 = new Applicant<>(new Student());
		Applicant<HighStudent> app4 = new Applicant<>(new HighStudent());
		Applicant<MiddleStudent> app5 = new Applicant<>(new MiddleStudent());
				
		//Applicant<?>
//		Course.registerCour(app1);
//		Course.registerCour(app2);
//		Course.registerCour(app3);
//		Course.registerCour(app4);
//		Course.registerCour(app5);
		
		//Applicant<? extends Student> : Student, HighStudent, MiddleStudennt
		//Course.registerCour2(app1);
		//Course.registerCour2(app2);
		Course.registerCour2(app3);
		Course.registerCour2(app4);
		Course.registerCour2(app5);
		
		//Applicant<? super Worker> : Worker, Person
		Course.registerCour3(app1);
		Course.registerCour3(app2);
		//Course.registerCour3(app3);
		//Course.registerCour3(app4);
		//Course.registerCour3(app5);
		
	}

}
