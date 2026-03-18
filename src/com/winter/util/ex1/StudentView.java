package com.winter.util.ex1;

import java.util.ArrayList;

public class StudentView {
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			this.view(ar.get(i));
		}
	}
	
	public void view(StudentDTO studentDTO) {
		System.out.println("이름 : "+studentDTO.getName());
		System.out.println("국어 : "+studentDTO.getKor());
		System.out.println("영어 : "+studentDTO.getEng());
		System.out.println("수학 : "+studentDTO.getMath());
	}

}
