package com.shinhan.day09;

//사용자 정의 예외
//표준라이브러리에 있지 않음
//통상적으로 일반예외는 Exception의 자식 클래스로, 실행예회는 RuntimeException의 자식 클래스로 선언
//사용자 정의 예외 클래스에서는 기본 생성자와 예외 메시지를 입력받는 "생성자"를 선언함
class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);	
	}
}


class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	 public WrongPasswordException(String message) {
		 super(message);//안 쓰면 null로 받음
	 }
}


public class LoginExample {
	public static void main(String[] args) {
		try {
			login("blㄹㄹㄹue", "12345");
			System.out.println("로그인 성공");
		} catch (NotExistIDException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		

	}

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재 X");

		}
		// password가 12345가 아니라면 WrongPasswordException을 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드 틀림");
		}
	}
	
	

}



