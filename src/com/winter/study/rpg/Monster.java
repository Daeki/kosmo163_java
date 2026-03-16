package com.winter.study.rpg;

import com.winter.study.rpg.weapon.Staff;

public class Monster {
	
	String name;
	int hp;
	int damage;
	Staff staff;
	int gold=20;
	
	public void attack(Character c) {
		
		
	}
	
	public Monster() {
		System.out.println("몬스터가 생성되었습니다");
		this.name="슬라임";
	}
	
	public int check() {
		//hp가 0 이하인지 체크
		if(this.hp<1) {
			System.out.println("꾸어억");
			return gold;
		}
		
		return 0;
	}
	
	public void t() {
		//----
		return;
	}

}
