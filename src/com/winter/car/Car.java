package com.winter.car;

public class Car {
	
	// 필드
	String company="kia";
	String model;
	int price;
	boolean manual;//true : 수동, false : 자동
	//instance 초기화 블럭
	{
		System.out.println("인스턴스블럭 : "+this.company);
		this.company = "현대자동차";
	}

	// 생성자
	public Car() {
		this("그랜저");
		System.out.println("기본생성자 호출");
		
	}
	public Car(String model) {
		this(model, 50000000);
	}
	
	public Car(String model, int price) {
		this(model, price, false);
		
	}
	
	public Car(String model, int price, boolean manual) {
		System.out.println("생성자 : "+this.company);
		this.company = "르노자동차";
		this.model = model;
		this.price = price;
		this.manual = manual;

	}

	//메서드 헤더, {}메서드 바디
	public void info() {
		
		System.out.println("제조사 : " + this.company);
		System.out.println("모델명 : " + this.model);
		System.out.println("가격 : " + this.price);
		System.out.println("수동여부 : " + this.manual);
	}

}
