package com.shinhan.day04;

import java.util.Arrays;
import java.util.Scanner;

// java를 실행하면 loader에 의해 메서드 영역에 올라감 -> static 영역으로 static 변수, 상수들이 올라감

public class Lab3 {

	//field: Lab3의 속성, 특징, 변수 -> 해당 class의 모든 메서드에서 공유하는 변수
	
	static Scanner sc = new Scanner(System.in); //표준(키보드)입력을 받아서 효율적으로 사용하기 위해 scanner Util 사용 
	static String[] nameArr; //밖에 있는 변수는 초기화 안 해도 됨
	static int[] scoreArr;
	static Grade[] gradeArr;
	
	public static void main(String[] args) {
		
		boolean isContinue = true;
		
		while(isContinue) {
		//aa: while(true) {
			menuDisplay();
			int job = sc.nextInt();
			
			
			switch(job) {
				case 1 -> {f_insert();}
				case 2 -> {f_select();}
				case 3 -> {f_maxScore();}
				case 4 -> {f_avgScore();}
				case 5 -> {f_upperScore();}
				
				case 6 -> {
					System.out.println("프로그램 종료");
					//switch에서 break는 switch문만 빠져나감. 그러면 while 안 끝남. -> label -> 코드가 길어지면 label 찾기 어려움
					//break aa;
					isContinue = false;
				}
		
				default -> {System.out.println("1~6까지만 입력하세요"); break;}
			}
		}
	}
	
	private static void f_upperScore() {
		int score = numCheck("기준 점수를 입력하세요: ");
		
		System.out.print("===%d점 이상 학생 목록===\n");
		
		for(int i = 0; i < scoreArr.length; i++) {
			if(scoreArr[i] >= score) {
				studentDisplay(i);
				}
			}
		}
		
	private static void studentDisplay(int i) {
		System.out.printf("%s => 점수: %3d, 등급: %3s\n", nameArr[i], scoreArr[i], gradeArr[i]);
		
	}

	private static void f_avgScore() {
		if(!nullCheck()) return;
		int sum = 0;
		
		for(int i = 0; i < scoreArr.length; i++) {
			sum += scoreArr[i];
		}
		System.out.println("전체 학생의 평균 점수 :  " + (double)sum/count);
		
	}

	private static void f_maxScore() {
		if(!nullCheck()) return;
		String maxName = null;
		int maxScore = -1; //있을 수 없는 값
		
		for(int i = 0; i < nameArr.length; i++) {
			if(scoreArr[i] > maxScore) {
				maxScore = scoreArr[i];
				maxName = nameArr[i];
;			}
		}
		System.out.printf("최고 점수를 받은 학생: %s (%d점)\n", maxName, maxScore);	
	}

	private static void f_select() {
		//성적조회
		if(!nullCheck()) return; //숫자가 없으면
				
		for(int i = 0; i < nameArr.length; i++) {
			System.out.println("===학생 성적 목록===");
			studentDisplay(i);
		}
		
	}
	
	private static boolean nullCheck() {
		if(nameArr == null) {
			System.out.println("학생 정보가 아직 입력되지 않았습니다."); 
			return false;
		}
		return true;
	}
		
	private static int numCheck(String message) {
		
		while(true) {
			System.out.print(message);
			
			if(sc.hasNextInt()) {
				count = sc.nextInt(); break;
			}
			System.out.println("숫자로!!"); //숫자가 입력되지 않으면 "숫자로!!" 출력하고
			sc.next(); //버리기
			}
		return count;
		
	}
	
	static int count = 0;
	private static void f_insert() {
		int count = numCheck("학생수를 입력하세요");
			
			//배열은 생성 후 사용 가능
			nameArr = new String[count];
			scoreArr = new int[count];
			gradeArr = new Grade[count];
			sc.nextLine(); // 학생 수 입력 후 enter은 버림
			
			for(int i = 0; i < count; i++) {
				System.out.printf("%d번째 학생 이름, 점수: ", i+1);
				String data = sc.nextLine(); //줄 읽음 -> 기본은 공백으로 구분
				String[] arr = data.split(","); //, 로 나눔, arr 0번째는 이름, 1번째는 점수
				
				//배열 생성
				nameArr[i] = arr[0];
				scoreArr[i] = Integer.parseInt(arr[1].trim()); //arr가 string이니까 int로 바꿈. .trim() -> " 99" -> "99" 가능
				gradeArr[i] = getGrade(scoreArr[i]);
			}
		}
		

	private static Grade getGrade(int score) { //점수가 들어옴
		Grade result = null;
		
		switch(score/10) {
			case 9, 10->{result=Grade.A;} 
			case 8 -> {result=Grade.B;} 
			case 7 -> {result=Grade.C;} 
			case 6 -> {result=Grade.D;} 
			default -> {result=Grade.F;} 
		}
		return result;
	}

	//함수: 문장들의 묶음 -> 재사용하려고, 모듈화, 
	private static void menuDisplay() { //return 안 해!. static 없으면 static 접근 못 함. private: Lab3 class에서만 접근 가능
		System.out.println("-----------------------------------------------------");
		System.out.println("1.학생수(이름,점수입력)  2.성적목록  3.최고 점수를 받은 학생 찾기");
		System.out.println("4.평균 점수  5.특정 점수 이상 학생  6.종료");
		System.out.println("-----------------------------------------------------");
		System.out.print("선택 > ");
	}

}
