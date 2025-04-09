package com.shinhan.day05;

public class NoteBookTest {

	public static void main(String[] args) {
		NoteBook aa = new NoteBook("AAA", "ddom", 120);
		
		System.out.println(aa.getModel());
		aa.setModel("BBB");
		
		System.out.println(aa.getModel());
	}

}
