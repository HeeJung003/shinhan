package com.shinhan.doc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class DocDTO {
	private int doctor_id;
	private String doctor_name;
	private String dept;
	

	@Override
	public String toString() {
		return "의사번호 = " + doctor_id + ", 의사이름 = " + doctor_name + ", 진료과 = " + dept;
	}




}