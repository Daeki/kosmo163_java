package com.winter.exception;

public class ExceptionMain1 {

	public static void main(String[] args) {
		ExceptionEx e1 = new ExceptionEx();
		try {
			e1.ex2();
		}catch (MyException e) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			String str=null;
			
			str.charAt(0);
			System.out.println(args[0]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}catch (Throwable e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("종료합니다");	
		
	}

}
