package com.winter.star;

import com.winter.star.zerg.Drone;

public class StarMain {

	public static void main(String[] args) {
		
		Drone d1 = new Drone();
		d1.hp = 40;
		d1.damage = 5;
		d1.color = "노란색";
		d1.name = "드론1";
		d1.work();

	}

}
