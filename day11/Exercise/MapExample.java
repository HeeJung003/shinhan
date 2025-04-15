package com.shinhan.day11.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.shinhan.day11.collection.Board;


public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			totalScore += entry.getValue();
			if(entry.getValue()>maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}		
		System.out.println("최고 점수를 받은 아이디는 : " + name);
		System.out.println("최고 점수는 : " + maxScore);
		System.out.println("점수 합계 : " + totalScore);
		System.out.println("평균 : " + (totalScore/map.size()));
	}
}
