package doctor;

import java.util.List;

import patient.PatDTO;

public class DocView {
	public static void display(List<DocDTO> doclist) {
		doclist.stream().forEach(doc -> System.out.println(doc));
	}
	
	public static void display(DocDTO doc) {
		System.out.println(doc);
	}
	
	public static void display(String message) {
		System.out.println("**알림** "+ message);
	}
}
