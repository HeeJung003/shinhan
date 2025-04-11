package com.shinhan.day09;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		// 한글이름 3자만 가능한 정규표현식
		String regExp = "[가-힣]{3}";
		String data = "홍길동";

		boolean resutl = Pattern.matches(regExp, data);
		System.out.println(resutl);

	}

	private static void f2() {
		// email
		// + : 1개이상, * : 0개이상, ? : 0개이거나 1개이거나
		// () 그룹 1
		String regExp = "[0-9A-Za-z]+@(\\w+)\\.\\w+";
		String data = "gmlw1@naver.com";

		boolean resutl = Pattern.matches(regExp, data);
		System.out.println(resutl);

		// HashSet: 중복허용 안 함
		HashSet<String> hs = new HashSet<>();

		data = "이메일은 gmlw1@naver.com gmlw1@naver.com gmlw1@daum.com입니다. 추가 이메일은 gmlw1@gmail.com 입니다.";

		// 이메일만 뽑고 싶음
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(data);

		while (matcher.find()) {
			System.out.println(matcher.group());// 매칭되는거 전체
			System.out.println(matcher.group(1));
			System.out.println("------------");

			hs.add(matcher.group(1));
		}
		System.out.println(hs.size() + "가지 이메일의 종류 사용 중");

	}

	private static void f1() {
		// [] : 선택
		// - : 범위
		// {3} : 3자리 {3, 4} : 3자리이거나 4자리 수
		String regExp = "[01]{3}-[0-9]{3,4}-[0-9]{4}";

		String data = "010-1234-1234";

		// 내 데이터가 패턴에 맞아?
		boolean resutl = Pattern.matches(regExp, data);
		System.out.println(resutl);

		// 데이터 가져오는 방법
		String regExp2 = "([01]{3})-([0-9]{3,4})-([0-9]{4})"; // 패턴 저장
		data = "aaaaaaaaaaaaaaaaa 010-1111-2222 bbbbbbbbbbbbbbb 010-2222-3333";
		// 패턴에 맞는것만 추출해줘
		Pattern pattern = Pattern.compile(regExp2);
		Matcher matcher = pattern.matcher(data);

		while (matcher.find()) {
			System.out.println(matcher.group(0)); // 매칭되는거 전체
			System.out.println(matcher.group(1)); // 첫번째 그룹 -> 패턴에서 ()로 묶음
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
			System.out.println("------------");
		}
	}

}
