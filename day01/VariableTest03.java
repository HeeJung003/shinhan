package com.shinhan.day01;

//>java VariableTest03
//JVM이 load ... static이 메모리에 올라옴
//new에 의해서 객체를 만들면 non-static도 사용 가능

public class VariableTest03 {
	//자바는 return을 할지 안 할지 꼭 써야 됨
	
	//1. field
	//함수 밖에 있으니까 지역변수 X, field
	int score1=100;
	
	//2. method
	void f1() {
		//지역변수: 초기화해야 쓸 수 있음
		int score2=100;
		System.out.println("f1함수 : " + (score1+score2));
	}
	
	void f2() {
		int score3=100;
		//System.out.println("f1함수 : " + (score1+score2+score3)); 내꺼가 아닌 필드는 사용할 수 없음. score2에서 오류
		System.out.println(score1+score3);
	}

	//3. block
	//문장을 쓰고싶으면 무조건 block
	{
		String subject = "자바";
		System.out.println("instance block...객체생성시마다 수행된다." + subject);
	}
	{
		//오류 -> 블록 내에서만 수행됨
		//System.out.println("instance block...객체생성시마다 수행된다." + subject); 
	}
	
	
	public static void main(String[] args) {
		//f1(); 
		//static은 non-static을 사용할 수 없음
		
		//위에 메소드들은 static이 없으니까 new로 만들어서 사용
		//aa도 변수, 밑에 4줄에서만 사용 가능
		VariableTest03 aa = new VariableTest03();
		System.out.println(aa.score1);
		aa.f1();
		aa.f2();
		
		{
			String myname = "jin";
			System.out.println(myname); //가능
		}
		//System.out.println(myname); //불가능. 지역에서 벗어남
	}

}
