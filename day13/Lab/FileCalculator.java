package com.shinhan.day13.Lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCalculator {

	public static void main(String[] args) throws Exception {
		String inputFileName = "src/com/shinhan/day13/Lab/cal_input.txt";

		System.out.println("--end--");

		new FileCalculator().addCalculateResult(inputFileName);
	}

	void addCalculateResult(String inputFileName) throws Exception {
		FileReader fr = new FileReader(inputFileName);
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter(inputFileName);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		int data;
		int sum = 0;
		int mul = 1;
		
		List<String> dataList = new ArrayList<String>();

		while ((line = br.readLine()) != null) {
			data = Integer.parseInt(line);
			sum += data;
			mul *= data;
			dataList.add(line);
		}
		
		dataList.add(sum + " ");
		dataList.add(mul + " ");
		
		for (String s : dataList) {
            bw.write(s);
            bw.newLine(); // To write each item in a new line
        }
		
		bw.close();
		fw.close();
		
		br.close();
		fr.close();
	}
}
