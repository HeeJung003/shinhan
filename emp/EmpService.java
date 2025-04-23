package com.shinhan.emp;

import java.util.List;

//Service : business logic 수행
//1) 이체업무 : (인출하기, 입금하기), = 인출하기, 입금하기는 dao가.
//2) 비밀번호: 암호화 
public class EmpService {
	
	EmpDAO empDAO = new EmpDAO(); 
	
	public List<EmpDTO> selectAll() {
		//
		return empDAO.selectAll();
		
	}
}
