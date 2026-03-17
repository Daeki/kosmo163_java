package com.winter.lang.ex3;

import java.util.Scanner;

public class WrapperService {
	
	public void ageCount(Scanner sc) {
		System.out.println("생년월일을 입력: xxxx-xx-xx");
		String data = sc.next();
		System.out.println(data);
		int year = 2026;
		//1. subString
		String r = data.substring(0, 4);
		System.out.println(r);
		//2. splite
		String [] ar = data.split("-");
		System.out.println(ar[0]);
		int y = Integer.parseInt(ar[0]);
		year = year-y;
		System.out.println(year);
		
		
	}

}
