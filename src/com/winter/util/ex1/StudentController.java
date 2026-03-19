package com.winter.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		
		//
		boolean flag = true;
		ArrayList<StudentDTO> ar= null;
		while(flag) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.학생정보백업");
			System.out.println("7.종 료");
			int select = sc.nextInt();
			
			if(select==1) {
				ar= ss.init();
			}else if(select==2) {
				sv.view(ar);
			
			}else if(select==3) {
				StudentDTO studentDTO = ss.search(ar);
				if(studentDTO != null) {
					sv.view(studentDTO);
				}else {
					System.out.println("찾는 학생이 없다");
				}
			
			}else if(select==4) {
				ss.add(ar);
//				StudentDTO studentDTO = ss.add();
//				ar.add(studentDTO);
			}else if(select==5) {
				ss.delete(ar);
				
			}else {
				break;
			}
			
		}
		
		
		
	}

}
