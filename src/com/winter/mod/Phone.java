package com.winter.mod;

public final class Phone {
	
	public static final String COMAPNY;
	final String PHONE_NAME;
	int price;
	
	{
		this.name = "아이폰";
		System.out.println("인스턴스 초기화 블럭 : " + this.name);
	}
	public Phone() {
		this.name="123";
		
	}
	static{
		Phone.company = "애플";
	}
	
	public final void call() {
		final int A=10;
		System.out.println(Phone.company);
		System.out.println(this.name);
		Phone.info();
	}
	
	public static void info(Phone p2) {
		Phone p = new Phone();
		System.out.println(Phone.company);
		System.out.println(p.name);
		p.call();
	}

}
