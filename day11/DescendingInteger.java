package com.shinhan.day11;

import java.util.Comparator;

//구현클래스
public class DescendingInteger implements Comparator<Integer>{

	@Override
	public int compare(Integer obj1, Integer obj2) {
		//ascending : < = >
		//obj2를 먼저 작성하면 descending 
		//obj1을 먼저 작성하면 ascending  
		return obj2-obj1;
	}

}
