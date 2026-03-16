package com.winter.study.rpg.unit;

import com.winter.study.rpg.Monster;
import com.winter.study.rpg.weapon.Sword;
import com.winter.study.rpg.weapon.Weapon;

public class Warrior extends Character {
	
	Weapon weapon;

	@Override
	public void attack() {
		System.out.println("검 공격");
		
	}
}
