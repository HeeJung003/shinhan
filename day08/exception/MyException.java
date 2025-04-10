package com.shinhan.day08.exception;

//사용자 정의 exception 만들기
public class MyException extends RuntimeException{

	public MyException(String message) {
		super(message);
	}
	

}
