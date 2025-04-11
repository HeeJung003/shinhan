package com.shinhan.day09.MVC;

//Controller: 사용자와 소통. 요청와 응답
//Service: 업무 로직, 요청 처리
//DAO: db에 업무(CRUD작업: insert, select, update, delete)
//DTO: data를 transfer하기 위한 설계
//View: display

public class StudentController {
	public static void main(String[] args) {
		//서비스이용
		StudentDAO dao = new StudentDAO();
		StudentService service = new StudentService(dao);
		
		StudentDTO[] arr = service.findAll(); //배열로 return 해줌
		StudentView.print(arr);
		
		StudentView.print(service.findId("1"));
	}
}
