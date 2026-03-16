package com.winter.star.zerg;

public class Drone {
	
	public int hp;
	protected int damage;
	private String color;
	String name;
	
	public void work() {
		System.out.println("드론이 일합니다");
		this.info();
	}
	
	private void info() {
		System.out.println("이름 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.damage);
		System.out.println("색깔 : " + this.color);
	}

}
