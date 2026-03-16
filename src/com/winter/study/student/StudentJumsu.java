package com.winter.study.student;

public class StudentJumsu {
	//int num=3;
	//int n = num;
	public void t(Student st) { //Student st = student; //
		st.total = st.kor +st.eng + st.math;
		st.avg = st.total / 3.0;
	}
	
	public void t2(Student st) {
		st = new Student();
		st.total=90;
		st.avg=30.0;
	}

}
