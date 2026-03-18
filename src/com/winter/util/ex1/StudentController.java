package com.winter.util.ex1;

import java.util.Scanner;

public class StudentController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		
		//
		boolean flag = true;
		StudentDTO [] ar= null;
		while(flag) {
			System.out.println("1.학생정보초기화, 2.학생정보출력,3.학생정보검색 4.종 료");
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
			
			}else {
				break;
			}
			
		}
		
		
		
	}

}
