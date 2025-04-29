package doctor;

import java.util.List;
import java.util.Scanner;

public class DocService {
	static DocDAO docDAO = new DocDAO();

	// 모두 조회
	public List<DocDTO> selectAll() {
		return docDAO.selectAll();
	}

	// 의사 이름으로 조회
	public List<DocDTO> selectByName(String doc_name) {
		return docDAO.selectByName(doc_name);
	}

	// 의사 추가
	public int insertDoc(DocDTO doc) {
		return docDAO.insertDoc(doc);
	}

	// 의사 삭제
	public int deleteDoc(String doc_name, String dept) {
		return docDAO.deleteDoc(doc_name, dept);
	}

	// 의사 정보 수정
	public int updateDoc(String doc_name, String dept) {
		return docDAO.updateDoc(doc_name, dept);
	}
}
