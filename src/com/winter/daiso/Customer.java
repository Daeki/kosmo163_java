package com.winter.daiso;

public class Customer {
	
	int don;
	int point;
	
	public void buy(Product[] products) {// 매개변수를 배열로 선언
		for (int i = 0; i < products.length; i++) {
			this.don = this.don - products[i].price;
			this.point = this.point + products[i].point;
		}
		System.out.println("잔액 : " + this.don);
		System.out.println("포인트 : " + this.point);
		
	}
	
	public void buy(Product product) {//매개변수를 하나만 선언
		//자기가가진 돈에서 제품의 가격을 빼고
		//자기가가진 포인트에서 제품의 포인트를 더한다.
		this.don = this.don- product.price;
		this.point = this.point + product.point;
		//구매후 잔액과 포인트를 출력
		System.out.println("잔액 : "+this.don);
		System.out.println("포인트 : "+this.point);
	}

}
