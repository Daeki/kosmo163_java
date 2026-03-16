package com.winter.study.rpg.unit;

import com.winter.study.rpg.weapon.Staff;

public class Wizard extends Character {
	//이름, 체력, 마나, 주문력, 경험치, 레벨, 

	Staff staff;
	
	public Wizard() {
		
	}
	
	//부모로 부터 상속 받은 메서드의 내용을 재정의 하는것
	//오버라이딩 
	//메서드의 선언부는 부모와 동일해야함
	//단, 접근지정자는 같거나 더 넓은 범위로 설정 가능
	public void attack() {
		System.out.println("마법 공격");
	}
	
	@Override
	public void info() {
		super.info(); // 부모의 info() 메소드 호출
		
		System.out.println(staff);
		
	}
	
	
}
