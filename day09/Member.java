package com.shinhan.day09;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Builder
@AllArgsConstructor //모든 argument 생성자 만들어줌
@RequiredArgsConstructor //두개?
@Data
public class Member {
	private final String id; //final id는 반드시 넣어야 돼
	@NonNull private String name; //NonNull: 이름 없으면 오류
	private int age;
}
