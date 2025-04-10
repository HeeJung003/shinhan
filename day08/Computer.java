package com.shinhan.day08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//VO(value Object)
//DTO(Data Transfer Object)
//JavaBeans 기술에서 사용됨 (조건: field는 private, 기본 생성자 필수, getter/setter 필수)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Computer {
//1. field
	private String model;
	private String os;
	private int price;
	
}
