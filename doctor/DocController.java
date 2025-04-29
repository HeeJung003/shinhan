package doctor;

import java.util.List;
import java.util.Scanner;

public class DocController {
	static Scanner sc = new Scanner(System.in);
	static DocService docService = new DocService();

	public static void main(String[] args) {
		boolean isStop = false;
		while (!isStop) {
			manudisplay();
			int job = sc.nextInt();
			switch (job) {
			case 1 -> {f_selectDocAll();}
			case 2 -> {f_selectDocByName();}
			case 3 -> {f_insertDoc();}
			case 4 -> {f_updateDoc();}
			case 9 -> {isStop = true;break;}
			}
		}
	}

	private static void f_updateDoc() {
		System.out.print("수정할 의사 이름 : ");
		String doctor_name = sc.next();
		System.out.print("수정할 의사 진료과 : ");
		String dept = sc.next();
		docService.updateDoc(null, doctor_name, dept);
		DocView.display("수정되었습니다");
		
	}

	private static void f_deleteDoc() {
		System.out.print("삭제할 의사 이름 : ");
		String doctor_name = sc.next();
		System.out.print("삭제할 의사 진료과 : ");
		String dept = sc.next();
		docService.deleteDoc(doctor_name, dept);
		DocView.display("삭제되었습니다");
	}

	private static void f_insertDoc() {
		System.out.print("신규 의사 ID : ");
		int doctor_name = sc.nextInt();
		System.out.println("신규 의사 이름 : ");
		String doctor_id = sc.next();
		System.out.println("신규 의사 진료과 : ");
		String dept = sc.next();
		docService.insertDoc(makeDoc());
		DocView.display("추가되었습니다");
	}

	private static void f_selectDocByName() {
		System.out.print("의사 이름을 입력하세요 : ");
		String doctor_name = sc.next();
		System.out.println("입력하신 의사 정보입니다.");
		List<DocDTO> doclist = docService.selectByName(doctor_name);
		DocView.display(doclist);
	}

	private static void f_selectDocAll() {
		System.out.println("병원에 있는 모든 의사의 정보를 조회합니다.");
		List<DocDTO> doclist = docService.selectAll();
		DocView.display(doclist);
	}

	private static void manudisplay() {
		System.out.println("==============의사(Doc) 관리==============");
		System.out.println("1. 의사 모두 조회 | 2. 의사 조회");
		System.out.println("3. 의사 등록 | 4. 의사 정보 삭제 | 5. 의사 정보 수정");
		System.out.println("9. 종료");
		System.out.println("=======================================");
		System.out.print("입력 >> ");
	}
}
