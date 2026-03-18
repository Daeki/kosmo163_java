package com.winter.util.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}
	
	public StudentDTO [] init() {
		//data를 파싱 작업
		StringTokenizer st = new StringTokenizer(this.data, "-");
		StudentDTO [] ar = new StudentDTO[3];
		int index=0;
		while(st.hasMoreTokens()) {
			System.out.println();
			StudentDTO dto = new StudentDTO();
			String s1 = st.nextToken();
			dto.setName(s1);
			String s2 = st.nextToken();
			dto.setKor(Integer.parseInt(s2));
			String s3 = st.nextToken();
			dto.setEng(Integer.parseInt(s3));
			String s4 = st.nextToken();
			dto.setMath(Integer.parseInt(s4));
			ar[index]=dto;
			index++;
			System.out.println("======================");
		}
		
		return ar;
		
	}
	
	
	//학생검색 
	public StudentDTO search(StudentDTO [] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름을 입력");
		String name=sc.next();
		for(int i=0;i<ar.length;i++) {
			if(name.equals(ar[i].getName())) {
				return ar[i];
				
			}
		}
		
		return null;
	}
	
	
	
	
	

}
