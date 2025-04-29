package doctor;

public class DocDTO {

	private int doc_id;
	private String doc_name;
	private String dept;
	
	
	public DocDTO(int doc_id, String doc_name, String dept) {
		super();
		this.doc_id = doc_id;
		this.doc_name = doc_name;
		this.dept = dept;
	}


	public int getDoc_id() {
		return doc_id;
	}


	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}


	public String getDoc_name() {
		return doc_name;
	}


	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
