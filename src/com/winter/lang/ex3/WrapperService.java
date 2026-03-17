package com.winter.lang.ex3;

import java.util.Scanner;

public class WrapperService {
	
	public void juminCheck2(Scanner sc) {
		System.out.println("주민번호 입력: xxxxxx-1234567");
		String data = sc.next();
		
		for(int i=0;i<data.length()-1;i++) {
			char ch = data.charAt(i);
			//String.valueof()
			Integer.parseInt(ch+"");
		}
		
		
	}
	
	
	public void juminCheck(Scanner sc) {
		System.out.println("주민번호 입력: xxxxxx-1234567");
		String data = sc.next();
		int num=2;
		int sum=0;
		for(int i=0;i<data.length()-1;i++) {
//			if(i==6) {
//				continue;
//			}
			String s= data.substring(i, i+1);
			if(s.equals("-")) {
				continue;
			}
			int c = Integer.parseInt(s);
			sum = sum+c*num;
			num++;
			if(num==10) {
				num=2;
			}
			
		}//for 끝
		System.out.println(sum);
		sum = sum%11;
		sum = 11-sum;
		if(sum>9) {
			sum = sum%10;
		}
		
		int check = Integer.parseInt(data.substring(data.length()-1));
		if(sum == check) {
			System.out.println("올바른 번호다");
		}else {
			System.out.println("틀린번호다");
		}
		
		
	}
	
	public void ageCount2(Scanner sc) {
		System.out.println("주민번호 입력: xxxxxx-1234567");
		String data = sc.next();
		//나이를 계산
		System.out.println(data);
		String s = data.substring(0, 2);
		int n = Integer.parseInt(data.substring(0, 2));
		System.out.println(n);
		int year=2026;
		int c = Integer.parseInt(data.substring(7, 8));
		System.out.println(c);
		if(c<3) {
			n = 1900+n;
		}else {
			n = 2000+n;
		}
		
		year = year - n;
		
		System.out.println(year);
		
	}
	
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
