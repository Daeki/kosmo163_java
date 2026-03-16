package com.winter.study.rpg.unit;

//추상 클래스 : 객체생성불가, 상속을 목적으로 만들어진 클래스
public abstract class Character {
	// 이름, 체력, 마나, 주문력, 경험치, 레벨,
	String name;
	int damage;
	int hp;
	int mp;
	int gold = 0;
	int level;
	
	// 추상 메소드 : 몸체가 없는 메소드, 
	// 자식 클래스에서 반드시 오버라이딩 해야하는 메소드
	public abstract void attack();

	public void info() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.damage);
		System.out.println("hp : " + hp);
	}

}
