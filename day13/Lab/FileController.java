package com.shinhan.day13.Lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileController {
	
	public static void main(String[] args) throws Exception {
		String inputFileName = "src/com/shinhan/day13/Lab/input.txt"; //여기 있는 파일을
		String outputFileName = "src/com/shinhan/day13/Lab/output.txt"; //여기에 쓰고싶어
		
		//밑에 static을 붙일 수 없다고 했으니까 class. 로 만들어서 객체 생성함
		new FileController().reverseLine(inputFileName, outputFileName);  
		System.out.println("===end===");
		
	}
	void reverseLine(String inputFileName, String outputFileName) throws Exception {
		FileReader fr = new FileReader(inputFileName); //파일이 이미 있으니까, 이 파일을 읽을거야
		BufferedReader br = new BufferedReader(fr); //한 줄씩 읽고 싶으니까 buffer을 쓸게
		
		FileWriter fw = new FileWriter(outputFileName); //이제 파일에 쓸거야
		BufferedWriter bw = new BufferedWriter(fw); // 한줄씩 쓰려고
		
		List<String> data = new ArrayList<String>(); //string 타입으로 받으라고 했으니까 
		
		String line; 
		while ((line = br.readLine()) != null) { //줄 단위로 읽을거야
			data.add(line); //line에 넣을거야
		}
		
		for(int i = data.size()-1; i > -1; i--) { //data(output에 저장할 내용)에 있는 내용을
			bw.write(data.get(i)); //한 줄씩 받은걸 쓸거야
			bw.newLine(); //한 줄 띄어줘
		}
		
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}
