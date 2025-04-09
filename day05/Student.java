package com.shinhan.day05;

public class Student {
	//main없음 = 실행 목적 X
	//라이브러리로 다른 파일에서 사용할 목적으로 만듦 -> template
	
//	1. field (static:class변수라고 얘기함 | non-static:instance변수라고 얘기함)
	//공통 요소들 생성 -> new하면 새롭게 생김
	//new에 의해 자동초기화 됨
	String name;
	String major;
	double score; //0.0
	char grade; //공백
	boolean isWorking; //진행중인지. (휴학? 재학?) false로 초기화
	
	//학생 수 저장하는 변수
	//static변수: class를 이용하는 모든 object공유
	//static을 안 붙이면 공유 안돼서 그냥 1로만 출력됨
	//class가 load될 때 method영역으로 올라감. 자동초기화 됨 -> object 생성없이 접근가능
	public static int studentCount;
	
//	2. constructor
	//생성하는 방법이 여러가지로 정의한다면 overloading(재정의 X, 추가한다 O)
	//class 이름이랑 똑같이 만들어야 됨
	//내가 정의하지 않으면 컴파일할 때 컴파일이 기본생성자 제공됨
	//내가 정의하면 기본 생성자 제공 X
	//이 class로 만든 현재객체 : this
	Student() {
		//하나의 생성자가 같은 이름의 다른 모양의 생성자 호출 -> this()
		//속성을 접근할 때는 this.
		//함수를 접근할 때는 this()
		
		//생성자가 생성자를 부름		
		this(null, null, 0.0, false);
	}
	
	Student(String name) {
		//매개변수이름과 멤버변수 이름이 충돌 -> this 사용해서 해결
		//this.name = name;
		
		this(name, null, 0, false);
	}
	
	Student(String name, String major) {
		//매개변수이름과 멤버변수 이름이 충돌 -> this 사용해서 해결
		//this.name = name;
		//this.major = major;
		
		this(name, major, 0, false);
		
	}
	
	Student(String name, String major, double score) {
		//매개변수이름과 멤버변수 이름이 충돌 -> this 사용해서 해결
		//this.name = name;
		//this.major = major;
		//this.score = score;
		
		this(name, null, score, false);
		//grade = getGrade(score); -> 어차피 매개변수 4개인 곳에서 부름
	}
	
	Student(String name, String major, double score, boolean isWorking) {
		//매개변수이름과 멤버변수 이름이 충돌 -> this 사용해서 해결
		//new할 때마다 이쪽으로 들어옴 (this()를 사용했으니까)
		studentCount++;
		System.out.printf("학생이 %d번째 생성\n", studentCount);
		
		this.name = name;
		this.major = major;
		this.score = score;
		grade = getGrade(score);
		this.isWorking = isWorking;
	}
	
//	3. 일반 method
	private char getGrade(double score) {
		char result = ' ';
		switch((int)score/10) {
		case 9, 10 -> {result = 'A';}
		case 8 -> {result = 'B';}
		default -> {result = 'F';}
		}
		return result;
	}
	
	public static int getCount() {
		//외부에서 아무대나 접근하고 싶어 -> public
		//new 해야 접근 가능 -> static은 static만 사용 가능 -> static
		//일반 메서드
		return studentCount;
	}
	
	void print() {
		System.out.println("-------학생정보-------");
		System.out.println("이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("점수: " + score);
		System.out.println("학점: " + grade);
		System.out.println("재학중: " + isWorking);
	}
	
//	4. block : 문장들의 묶음, 이름 없음
	{
		//생성자와 유사
		System.out.println("-------------------------");
		System.out.println("instatnce 생성시 마다 수행됨(instance block)"); //new할 때마다 실행
		System.out.println("-------------------------");
	}
	//여기서는 main이 없으니까 문장을 쓸 수 없음 -> 문장을 쓰고 싶으면 block사용
	static{
		System.out.println("-------------------------");
		System.out.println("class load시 1번 수행함(static block)"); //1번 수행
		System.out.println("-------------------------");
	}
//	5. inner class 
	
}
