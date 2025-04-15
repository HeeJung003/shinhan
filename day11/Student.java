package com.shinhan.day11;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
 * 학생 5명
 * 조회하면 점수 순으로 desc
 * 같은 점수이면 전공 asc
 * 전공이 같으면 학번 desc
 */
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparable<Student>{
	private String stdId;
	private String name;
	private String major;
	private int score;
	
	@Override
	public int compareTo(Student o) {
		 int com1 = o.score - score; //점수 순으로 desc -> 뒤-앞
		 if(com1 == 0) { //점수가 같으면 
			 int com2 = major.compareTo(o.major); //전공 순으로 asc -> 앞-뒤
			 if(com2 == 0) {
				 return o.stdId.compareTo(stdId); //학번으로 desc -> 뒤-앞
			 }
		 }
		return com1;
	}
}
