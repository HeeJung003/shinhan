package com.shinhan.day09.Lab;

public class MySum {
	int first;
	int second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	/* 조건1 */

	@Override
	public String toString() {
		// return first+second+"";
		// 숫자를 문자로 바꿔라
		return String.valueOf(first + second);
	}

	/* 조건2 */

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MySum s) {
			if (s.toString().equals(this.toString())) {
				return true;
			}
		}
		return false;
	}

}
