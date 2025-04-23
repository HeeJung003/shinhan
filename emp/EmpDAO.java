package com.shinhan.emp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shinhan.day16.DBUtil;

//DAO (data access object) : db에 crud 작성 (select, insert, update, delete)
public class EmpDAO {
	//모든 직원 조회
	public List<EmpDTO> selectAll() {
		//들어오는 건 없는데 나가는건 여러개
		List<EmpDTO> emplist = new ArrayList<EmpDTO>();
		Connection conn = DBUtil.getConnection(); //db연결
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from employees";
		
		try {
			st = conn.createStatement();//통로 만듦
			rs = st.executeQuery(sql); //sql 실행
			while(rs.next()) {
				EmpDTO emp = makeEmp(rs); //길어지니까 makeEmp로 만들어야 
				emplist.add(emp); //그리고 그 emp를 emplist에 담을거야 그리고 보낼거야
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, rs);
		}
		return emplist;
	}

	private EmpDTO makeEmp(ResultSet rs) throws SQLException {
		EmpDTO emp = EmpDTO.builder()
				.commission_pct(rs.getDouble("commission_pct"))
				.department_id(rs.getInt("department_id"))
				.email(rs.getString("email"))
				.employee_id(rs.getInt("employee_id"))
				.first_name(rs.getString("first_name"))
				.hire_date(rs.getDate("hire_date"))
				.job_id(rs.getString("job_id"))
				.last_name(rs.getString("last_name"))
				.manager_id(rs.getInt("manager_id"))
				.phone_number(rs.getString("phone_number"))
				.salary(rs.getDouble("salary"))		
				.build();
		
		return emp;
	}
}
