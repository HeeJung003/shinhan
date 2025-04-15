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
		
		//map에서 결과 확인하는 방법
		//1. keySet
		Set<String> entry = map.keySet();
		
		for(String en: entry) {
			System.out.println(en + " -> " + map.get(entry));
		}
		
		
		
		//2. entrySet

//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			if(entry.getValue()>maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//			}
//			totalScore += entry.getValue();
//		}
	}
}