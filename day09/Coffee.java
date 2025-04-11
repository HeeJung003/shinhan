package com.shinhan.day09;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//lombok 어노테이션 생성
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "price")
@EqualsAndHashCode(of = {"manuName, price"}) //이름과 가격이 같으면 같은거야


public class Coffee {
	String menuName;
	int price;
	
	
	
}
