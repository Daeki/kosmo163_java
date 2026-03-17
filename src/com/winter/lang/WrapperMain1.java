package com.winter.lang;

public class WrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "123";
		Integer integer = new Integer(n);
		
		integer = Integer.valueOf(1);
		Long l = Long.valueOf(n);
		System.out.println(integer+1);
		
		//auto-boxing, auto-unboxing
		int num=3;
		integer = num;
		//auto-unboxing
		num = integer;
		
		long number = 3L;
		integer = (int)number;
		//num = l;
		//parsing
		num=Integer.parseInt("123");
		
	}

}
