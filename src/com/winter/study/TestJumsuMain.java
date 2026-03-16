package com.winter.study;

import com.winter.study.student.Student;
import com.winter.study.student.StudentJumsu;

public class TestJumsuMain {

	public static void main(String[] args) {
		StudentJumsu testJumsu = new StudentJumsu();
		Student student = new Student();
		student.kor=86;
		student.eng=89;
		student.math=70;
		
		testJumsu.t(student);
		
		System.out.println(student.total);
		System.out.println(student.avg);
		
		testJumsu.t2(student);
		
		System.out.println(student.total);
		System.out.println(student.avg);

	}

}
