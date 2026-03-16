package com.winter.biman;

public class Member {
	//Sigleton Pattern Design Pattern
	private static Member member;
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public static Member getInstance() {
		if(member == null) {
			Member.member = new Member();
		}
		return Member.member;
	}
	
	private Member() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
