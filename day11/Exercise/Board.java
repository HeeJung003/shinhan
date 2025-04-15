package com.shinhan.day11.Exercise;

import java.util.List;

class Board {
	private String title;
	private String content;

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}


public static void main(String[] args) {
 BoardDao dao = new BoardDao();
 List<Board> list = dao.getBoardList();
 for(Board board : list) {
 System.out.println(board.getTitle() + "-" + board.getContent());
 }
}
}
