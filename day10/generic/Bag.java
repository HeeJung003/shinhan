package com.shinhan.day10.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor

public class Bag<M, S, C> {
	M model;
	S size;
	C color;
}


