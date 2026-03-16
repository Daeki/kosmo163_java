package com.winter.ex1;

public class OverloadingTest {
//	public void hap(int b, int a) {
//		System.out.println(a + b);
//	}
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(int a, float b) {
		System.out.println(a + b);
	}
	
	public int hap(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

}
