package com.shinhan.pat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PatDAO {
	//환자 등록
	public int insertPat(PatDTO pat) {
		int result = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = """
				insert into PATIENTID(
				PATIENT_ID,
				PATIENT_NAME,
				RRN,
				BIRTH,
				AGE,
				GENDER,
				PHONE,
				ADDR)
				values(?, ?, ?, ?, ?, ?, ?, ?)
				""";
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, pat.getPatient_id());
			st.setString(2, pat.getPatient_name());
			st.setString(3, pat.getRrn());
			st.setString(4, pat.getBirth());
	        st.setInt(5, pat.getAge());
	        st.setString(6, pat.getGender());
	        st.setString(7, pat.getPhone());
	        st.setString(8, pat.getAddr());
			
			result = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		return result;
	}
	
	//환자 정보 수정
	public int updatePat(PatDTO pat, String oldname, String oldrrn) {
		System.out.println(pat + " " + oldname + " " + oldrrn);
		int result = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = """
				update patientID set
					PATIENT_NAME = ?,
					RRN = ?,
					PHONE = ?,
					ADDR = ?
				where PATIENT_NAME = ?
				and rrn = ?
				""";
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, pat.getPatient_name());
			st.setString(2, pat.getRrn());
			st.setString(3, pat.getPhone());
			st.setString(4, pat.getAddr());
			st.setString(5, oldname);
			st.setString(6, oldrrn);
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		System.out.println(result);
		return result;
	}
	
	//3.환자 모두 조회
	public List<PatDTO> selectAllPat() {
		List<PatDTO> patlist = new ArrayList<PatDTO>();
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet  rs = null;
		String sql = "select * from patientID";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				PatDTO pat = makePat(rs);
				patlist.add(pat);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, rs);
		}
		return patlist;
	}
	
	//환자 삭제
	public void deletePat(String patient_name, String rrn) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = "delete from patientID where patientID = ? and rrn = ?";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, patient_name);
			st.setString(2, rrn);
			
			int result = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private PatDTO makePat(ResultSet rs) throws SQLException {
		PatDTO pat = PatDTO.builder()
				.patient_id(rs.getInt("patient_id"))
				.patient_name(rs.getString("patient_name"))
				.rrn(rs.getString("rrn"))
				.birth(rs.getString("birth"))
				.age(rs.getInt("age"))
				.gender(rs.getString("gender"))
				.phone(rs.getString("phone"))
				.addr(rs.getString("addr"))
				.build();
		return pat;
	}
}

