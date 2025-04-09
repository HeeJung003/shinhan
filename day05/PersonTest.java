package com.shinhan.day05;

import java.util.Scanner; //이렇게 쓰는 것처럼 
import com.shinhan.day04.ch06.Person; //다른 패키지에 있는 person을 쓸거야

//접근지정자
//public:
//protected:
//생략: 같은 패키지에서만 접근 가능
//private:

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Person은 패키지 04에 있음
		
		Person p1, p2;
		
		p1 = new Person();
		p2 = new Person(20, "홍길동");
		
		p1.selfIntroduce();
		p2.selfIntroduce();
		
		System.out.println("인원 수 : " + Person.getPopulation());

	}

}
