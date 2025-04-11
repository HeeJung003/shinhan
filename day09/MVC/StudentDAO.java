package com.shinhan.day09.MVC;

//DAO : data access object
public class StudentDAO {
	
	// db에서 전부 조회해라
	// StudentDTO[] 안에 정보 4개 있음 -> StudentDTO[] 하나로 묶어서 할거야
	StudentDTO[] arr = new StudentDTO[5];
	{ //instance block.. new시 자동실행됨
		arr[0] = new StudentDTO("1", "가");
		arr[1] = new StudentDTO("2", "나", "컴퓨터", 1);
		arr[2] = new StudentDTO("3", "다", "컴퓨터", 4);
		arr[3] = new StudentDTO("4", "라");
		arr[4] = new StudentDTO("5", "마");
	}

	//여러개를 묶어서 return 한다.
	public StudentDTO[] selectAll() {
		return arr;
	}

	// 한명만 return 해라
	public StudentDTO selectById(String stdID) {
		//System.out.println(stdID);
			for(StudentDTO st:arr) {
				if(st.getStdID().equals(stdID)) return st;
				
			}
			//System.out.println("일치학생없음");
			return null;
	}
}
