package doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DocDAO {
	
	//모든 의사 조회
	public List<DocDTO> selectAll() {
		List<DocDTO> doclist = new ArrayList<DocDTO>();
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from doctorID";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				DocDTO doc = makeDoc(rs);
				doclist.add(doc);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, rs);
		} 
		return doclist;
		
	}
	
	//의사 이름으로 조회
	//동명이인 있을 수 있으니까 list
	public List<DocDTO> selectByName(String doc_name) {
		List<DocDTO> doclist = new ArrayList<DocDTO>();
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * from doctorID where doctor_name = ? ";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, doc_name);
			rs = st.executeQuery();
			
			while(rs.next()) {
				DocDTO doc = makeDoc(rs);
				doclist.add(doc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		return doclist;
	} 
	
	//의사 추가
	public int insertDoc(DocDTO doc) {
		int result = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = """
				insert into doctorID(
				doctor_id,
				doctor_name,
				dept)
				valuse (?, ?, ?)
				""";
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, doc.getDoc_id());
			st.setString(2, doc.getDoc_name());
			st.setString(3, doc.getDoc_name());
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		return result;
	}
	
	//의사 삭제 
	public int deleteDoc(String doc_name, String dept) {
		int result = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = "delete from doctorID where doctor_name = ? and dept = ? ";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, doc_name);
			st.setString(2, dept);
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		return result;
	}
	
	//의사 정보 수정
	public int updateDoc(String doc_name, String dept) {
		int result = 0;
		Connection conn = DBUtil.getConnection();
		PreparedStatement st = null;
		String sql = "update doctorID set doctor_name = ? and dept = ?";
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, doc_name);
			st.setString(2, dept);
			
			result = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, null);
		}
		return result;
	}
}
