package com.kakao.app.weapons;

public class Sword {

	private String name;
	private int damage;
	private int range;
	
	public Sword () {
		this.name = "롱소드";
		this.damage = 100;
		this.range = 20;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.damage);
		System.out.println(this.range);
		System.out.println("===========================");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	
	
	
}
