package com.winter.io.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.winter.util.ex1.StudentDTO;

public class StudentInfo {
	
	
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

}
