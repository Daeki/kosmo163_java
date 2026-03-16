package com.winter.study.rpg.unit;

import com.winter.study.rpg.weapon.Action;
import com.winter.study.rpg.weapon.Staff;
import com.winter.study.rpg.weapon.Sword;

public class CharacterMain {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.name = "메르세데스";
		Warrior w2 = new Warrior();
		
	
		
		Character c1 = w2;
		System.out.println(c1.name);
		
		Warrior w3 = (Warrior)c1;
		w3.weapon = new Sword();
		w3.weapon = new Staff();
		
		Action a = new Sword();
		
		
		

	}

}
