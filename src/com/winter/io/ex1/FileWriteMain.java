package com.winter.io.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		// 키보드로 부터 입력받은 메세지를
		// sub2//msg.txt 파일에 저장
		// 입력시 exit를 입력하면 쓰지않고 프로그램이 종료
		Scanner sc = new Scanner(System.in);
		File file = new File("D:\\DK\\sub1\\sub2\\msg.txt");
		boolean check = true;
		
		while(check) {
			System.out.println("입력");
			String s = sc.next();
			
			if(s.equalsIgnoreCase("EXIT")) {
				break;
			}
			
			try {
				FileWriter fw = new FileWriter(file, true);
				fw.write(s+"\n");
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
