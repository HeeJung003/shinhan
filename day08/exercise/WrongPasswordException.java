package com.shinhan.day08.exercise;

public class WrongPasswordException extends Exception {
	 public WrongPasswordException() {}
	 public WrongPasswordException(String message) {
		 super(message);
	 }
}