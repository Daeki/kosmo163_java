package com.winter.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain1 {

	public static void main(String[] args) {
		//ArryaList 객체 생성
		int [] ar = new int [2];
		List list = new ArrayList();
		list.add(1);
		list.add("two");
		list.add(true);
		list.add(new Scanner(System.in));
		
		
		list.add(1, 0);
		
		list.set(0, 100);
		
		//list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		
		System.out.println(list.size());

	}

}
