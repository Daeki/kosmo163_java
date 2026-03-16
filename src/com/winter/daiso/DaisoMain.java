package com.winter.daiso;

public class DaisoMain {

	public static void main(String[] args) {
		
		
		
		Keyboard k1 = new Keyboard();
		Mouse m1 = new Mouse();
		Tv t1 = new Tv();
		Notebook n1 = new Notebook();
		
		
		
		Customer customer = new Customer();
		customer.don=10000000;
		customer.point=100;
		
		Product[] products = {k1,m1};
		
		customer.buy(products);
		
		
		

	}

}
