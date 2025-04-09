package com.shinhan.day03;

import java.util.Calendar;

public class EnumTest {
	
	//여러 함수를 쓸 때 정수가 바뀔 수 있음 -> 미리 정의해두자
	//ex) f1()에서는 성공이 1인데 f2()에서는 성공을 2라고 했을 때를 대비
	//상수: 변하지 않는 값
	static final int SUCCESS = 1; //이제 success는 1만.
	static final int FAIL = 0; //이제 FAIL는 1만.
	static final int MONDAY = 0; //하필 monday도 0이라면 -> 방지하기 위해 -> Enum
	static final int LIMIT_SCORE = 80;
	//Enum: 열거형, 한정적인 값들의 묶음. 관련있는 상수들만 묶음
	

	public static void main(String[] args) {
		f5();
	}
	
	private static void f5() {
		JobResult result = call(70);
		if(result == JobResult.SUCCESS) {
			System.out.println("성공");
		}else if(result == JobResult.FAIL) {
			System.out.println("실패");
		}
	}

	private static JobResult call(int score) {
		return score >= LIMIT_SCORE?JobResult.SUCCESS:JobResult.FAIL;
	}

	private static void f3() {
		Calendar cal = Calendar.getInstance(); //객체를 얻어라. 
		
		//System.out.println(cal); //cal에 들어있는 내용 나옴
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONDAY);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		Week[] arr = Week.values();//week에 있는 values를 보고싶어
		for(Week w : arr) {
			System.out.println(w.ordinal() + " => " + w.name());
		}
		
		Week today = null;
		
		//이것만 쓸 수 있음
		switch(week) {
		case 1:today=Week.SUNDAY;break;
		case 2:today=Week.TUESDAY;break;
		case 3:today=Week.WEDNESDAY;break;
		case 4:today=Week.THURSDAY;break;
		case 5:today=Week.FRIDAY;break;
		case 6:today=Week.SATURDAY;break;
		case 7:today=Week.SUNDAY;break;
		}
		System.out.println("today : " + today);
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
	}

	private static void f2() {
		JobResult a = JobResult.SUCCESS;
		JobResult[] arr = JobResult.values();
		for(JobResult job:arr) {
			System.out.println(job);
		}
	
		System.out.println(a);
		
	}

	private static void f1() {
		//어떤 작업의 결과가 성공인지 실패(1)인지 판단(0)하고자 함
		int result = 1; //성공
		if(result == SUCCESS) {
			System.out.println("성공");
		}else if(result == FAIL) {
			System.out.println("실패");
		}
	}

}
