package com.winter.util;

import java.util.StringTokenizer;

public class TokenMain1 {
	
	public void t2() {
		String str="winter-20-iu-30-홍길동-520";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
		}
		
		
		
		
	}
	
	public void t1() {
		String str="winter-20-ki-muge-iu-30-홍길동-520";
		String [] ar = str.split("-");
		for(int i=0;i<ar.length;i=i+2) {
			ar[i];
			ar[i+1];
		}
	}

	public static void main(String[] args) {
		String str="a--b-c-d";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.println(s);
			
		}
		

	}

}
