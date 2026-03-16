package com.winter.mod;

public class PhoneMain {
	
	int a=10;

	public void method() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		PhoneMain p1 = new PhoneMain();
		p1.a=10;
		//Phone p1 = new Phone();
		Phone.company = "삼성전자";
		Phone.info();
		//p1.price = 1000000;
		System.out.println();
		
		Phone p2 = new Phone();
		
		

	}

}
