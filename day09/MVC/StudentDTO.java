package com.shinhan.day09.MVC;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = {"stdID"})
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString

//DTO : data transfer object
public class StudentDTO {
	private final String name;
	private final String stdID; //학번
	private String major;
	private int grade;
}
