package com.shinhan.day12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class StringTest_ShinhanStudent implements Comparable<StringTest_ShinhanStudent> {
	String name;
	int score;

	@Override
	public int compareTo(StringTest_ShinhanStudent o) {
		return o.score - o.score;
	}

}
