package com.shinhan.day05.Lab;

import java.util.Arrays;

//getter 사용 미숙


public class BookMgr {
	Book booklist[];
	int totalPrice = 0;

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(Book b : booklist) {
			System.out.println(b.getTitle());
		}
	}
	
	void printTotalPrice() {
		
		for(Book b : booklist) {
			totalPrice += b.getPrice();
		}
		System.out.println("=== 책 가격의 총합 ===");
		System.out.println("전체 책 가격의 합 : " + totalPrice);
	}
	
}

