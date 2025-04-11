package com.shinhan.day09.MVC;

public class StudentService {
	StudentDAO dao;
	
	//밖에서 new해서 매개변수로 주면 더 좋음
	StudentService(StudentDAO dao) {
		this.dao = dao; //초기화하낟.
	}
	
	public StudentDTO[] findAll() {
		System.out.println("학생조회서비스");
		return dao.selectAll(); //dao안에 학생정보있음
	}
	
	public StudentDTO findId(String id) {
		System.out.println("특정학생조회서비스");
		return dao.selectById(id);
	}
	
}
