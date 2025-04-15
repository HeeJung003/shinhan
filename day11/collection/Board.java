package com.shinhan.day11.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
//java beans 기술: 기본 생성자가 필수


@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode //(of="subject") //subject이 같으면 같은걸로 할래 - f7()

public class Board implements Comparable<Board> {
	private String subject;
	private String content;
	private String writer;
	
	@Override
	public int compareTo(Board o) {
		// 작성자고 Asc, 작성자가 같으면 sub으로 Desc
		int com1 = writer.compareTo(o.writer); //asc
		if(com1 == 0) {
			return o.subject.compareTo(this.subject); //desc
		}
		return com1; //asc
	}
}
