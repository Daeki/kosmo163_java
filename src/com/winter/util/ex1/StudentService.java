package com.winter.util.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	private Scanner sc;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		this.sc = new Scanner(System.in);
	}
	
	public void backup() {
		//학생들의 정보를 info.txt 저장하기
	}
	
	public ArrayList<StudentDTO> init() {
		//info.txt의 내용을 출력
		File file = new File("D:\\DK\\sub1\\sub2\\info.txt");
		ArrayList<StudentDTO> list = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String s=null;
			while((s = br.readLine()) != null) {
				String [] ar = s.split("-");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(ar[0]);
				studentDTO.setKor(Integer.parseInt(ar[1]));
				studentDTO.setEng(Integer.parseInt(ar[2]));
				studentDTO.setMath(Integer.parseInt(ar[3]));
				list.add(studentDTO);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	public ArrayList<StudentDTO> initOld() {
		//data를 파싱 작업
		StringTokenizer st = new StringTokenizer(this.data, "-");
		//StudentDTO [] ar = new StudentDTO[3];
		ArrayList<StudentDTO> ar = new ArrayList<>();
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
			ar.add(dto);
			index++;
			System.out.println("======================");
		}
		
		return ar;
		
	}
	
	
	//학생검색 
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		
		System.out.println("학생이름을 입력");
		String name=sc.next();
		for(int i=0;i<ar.size();i++) {
			if(name.equals(ar.get(i).getName())) {
				return ar.get(i);
				
			}
		}
		
		return null;
	}
	
	//학생 추가 add
	//이름,국어, 영어, 수학 입력
	public void add(ArrayList<StudentDTO> ar) {
		
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("국어 입력");
		int kor = sc.nextInt();
		System.out.println("영어 입력");
		int eng = sc.nextInt();
		System.out.println("수학 입력");
		int math = sc.nextInt();
		System.out.println(name);
		System.out.println(math);
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(name);
		studentDTO.setEng(eng);
		studentDTO.setKor(kor);
		studentDTO.setMath(math);
		ar.add(studentDTO);
		
		
	}
	
	//학생의이름을 입력해서 일치하는 학생의 정보를 삭제
	//delete
	public void delete(ArrayList<StudentDTO> ar) {
		System.out.println("학생의 이름 입력");
		String name = sc.next();
		
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getName().equals(name)) {
				ar.remove(i);
				return;
			}
		}
		
		//return false;
		
	}
	
	
	
	
	

}
