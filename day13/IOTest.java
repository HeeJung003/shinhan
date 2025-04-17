package com.shinhan.day13;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
class Score implements Serializable{
	final String name;
	final int java;
	final int db;
	final int web;
	
	static String major = "컴공"; //직렬화에서 제외됨 
	String gender;
	transient String hobby; //직렬화에서 제외됨 -> 외부로 나가지 못 함
}
//Modifier(활용방법, 접근권한)
//접근권한 : public > protected > 생략 > private
//활용방법 : static(class꺼), final(변수에 넣으면 상수, 메소드레 넣으면 재정의 불가, 클래스에 너흥면 상속 X),
//			synchronized, abstract(정의있는데 구현 없어), transient(직렬화에서 제외)

public class IOTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		f13();
	}

	private static void f13() {
		
	}

	private static void f12() {
		//경로 또는 파일, 폴더 존재여부 확인
		File f1 = new File("src/com/shinhan/day12/Example/Example.java");
		File f2 = new File("src\\com\\shinhan/day12");
		System.out.println(f1.exists()?"존재":"안함");
		System.out.println(f2.exists()?"폴더존재":"폴더존재안함");
		System.out.println(f2.isDirectory()?"폴더맞음":"폴더없음");
		File arr[] = f2.listFiles();
		
		Arrays.stream(arr).forEach(s->System.out.println(s.getAbsolutePath()));
		
	}

	private static void f11() throws IOException, ClassNotFoundException {
		// score class가 여러개 있을 때
		//저장하고 다시 읽기
		List<Score> scoreList = List.of(Score.builder()
				.name("홍길동").java(100).db(90).web(80)
				.gender("남").hobby("운동")
				.build(),
				
				Score.builder()
				.name("홍길동2").java(60).db(60).web(60)
				.gender("남").hobby("운동")
				.build());
		
		FileOutputStream fw = new FileOutputStream("score.data");
		ObjectOutputStream oop = new ObjectOutputStream(fw);
		
		oop.writeObject(scoreList);
		
		FileInputStream fis = new FileInputStream("score.data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List scorelist_1 = (List) ois.readObject();
		System.out.println(scorelist_1);
		
		
		oop.close();
		fw.close();
		
	}

	private static void f10() throws IOException, ClassNotFoundException {
		FileOutputStream fw = new FileOutputStream("score.data");
		ObjectOutputStream oop = new ObjectOutputStream(fw);
		//score 생성
		Score score = Score.builder()
				.name("홍길동").java(100).db(90).web(80)
				.gender("남").hobby("운동")
				.build();
		
		//score 생성
		Score score3 = Score.builder()
				.name("홍길동222").java(100).db(90).web(80)
				.gender("남").hobby("운동")
				.build();
		
		oop.writeObject(score);
		oop.writeObject(score3);
		
		oop.close();
		fw.close();
		
		FileInputStream fip = new FileInputStream("score.data");
		ObjectInputStream ois = new ObjectInputStream(fip);
		
		Score score1_1 = (Score) ois.readObject();
		Score score3_1 = (Score) ois.readObject();
		System.out.println("score1_1 : " + score1_1);
		System.out.println("score3_1 : " + score3_1);
		//System.out.println("score_1 : " + score2 + score2.major);
		
	}

	private static void f9() throws IOException {
		//기본형도 이렇게 사용하는구나
		FileOutputStream fos = new FileOutputStream("aa.data");
		DataOutputStream dos = new DataOutputStream(fos); //
		dos.write(97);
		dos.writeChar('b');
		dos.writeBoolean(true);
		dos.writeDouble(10.1);
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("aa.data");
		DataInputStream dis = new DataInputStream(fis);
		
		int i = dis.read();
		char ch = dis.readChar();
		boolean b = dis.readBoolean();
		double d = dis.readDouble();
		System.out.println(i + " ; " + ch + b + d);
		
		dis.close();
		fis.close();
	}

	private static void f8() throws IOException {
		//객체를 vector로 만들어라
		
		FileReader fr = new FileReader("src/com/shinhan/day13/data.txt"); //2바이트씩 읽으니까 불편
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		List<Score> data = new Vector<>();
		
		while((line = br.readLine()) != null) {
			String[] arr = line.split("/");
			Score score = Score.builder() 
					.name(arr[0])
					.java(Integer.parseInt(arr[1]))
					.db(Integer.parseInt(arr[2]))
					.web(Integer.parseInt(arr[3]))
					.build();
			data.add(score);
			
		}

		br.close();
		fr.close();
		
		data.stream().forEach(s-> System.out.println(s));
		
	}

	private static void f7() throws IOException {
		// 한 줄로 읽기 -> Lab2
		FileReader fr = new FileReader("src/com/shinhan/day13/data.txt"); //2바이트씩 읽으니까 불편
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		line = br.readLine(); // 제목
		System.out.println(line.replace("/", "\t") + "\t총점");
		
		while((line = br.readLine()) != null) {
			int total = 0;
			String[] arr = line.split("/");
			
			for(int i = 1; i < arr.length; i++) {
				total += Integer.parseInt(arr[i]);
			}

			
			System.out.println(line.replace("/", "\t") +"\t"  + total );
		};
		
		br.close();
		fr.close();
		
		
	}

	private static void f6() throws IOException {
		FileWriter fw = new FileWriter("bb.txt");
		fw.write("문자출력1");
		fw.write("문자출력2");
		fw.write("문자출력3");
		fw.write("문자출력4");
		
		fw.close();
		
		
		FileReader fr = new FileReader("bb.txt");
		int i;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}; //2바이트
	}
	
	

	private static void f5() {
		// 파일에 출력하고 싶음
		// X
		try(FileOutputStream fos = new FileOutputStream("aa.txt")) {
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		try {
			FileInputStream fis = new FileInputStream("aa.txt");
			int  i;
			while((i = fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void f4() throws IOException {
		//출력(모니터 or 파일 or 네트워크)
		OutputStream op = System.out; //모니터에 찍어라
		op.write(97);
		op.flush(); //해야 보임!!!!
		
		PrintStream ps = System.out;
		ps.println(" 문자 출력");
	}

	private static void f3() {
		//f2에 있는 두 줄을 한 번에 쓸 수 있음
		try (FileReader fr = new FileReader("src/com/shinhan/day12/Exercise/Example.java")){
			
			int data;
			while((data = fr.read())!=-1) {
				System.out.print((char)data);
			};
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 존재 X");
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}finally {
			
		}
	}

	private static void f2() throws IOException {
		//파일
		FileInputStream fi = new FileInputStream("src/com/shinhan/day12/Exercise/Example.java");
		//보조스트림 (stream: 1byte, reader: 2byte) -> 한글은 2byte로 읽기 때문에 한글이 꺠지지 않음
		InputStreamReader ir = new InputStreamReader(fi); 
		int i;
		
		while((i = ir.read()) != -1) { //-1은 end of file
			System.out.print((char)i); //한글은 2byte니까 깨짐
		}
		fi.close();
		ir.close();
		
	}

	private static void f1() throws IOException {
		//입력스트림: 키보드, 파일, 프로그램(네트워크)
		System.out.print("입력: ");
		InputStream is = System.in;
		int i;
		i = is.read();
		System.out.println((char)i);
		
		byte[] arr = new byte[10];
		i = is.read(arr); 
		System.out.println(Arrays.toString(arr));
		
		String data = new String(arr);
		System.out.println(data);
		
	}
}


