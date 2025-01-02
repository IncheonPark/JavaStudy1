package com.kakao.app.units;

import com.kakao.app.weapons.Sword;

public class Character {

	//PC NPC, ex) MapleStory
	private String name;
	private String job;
	private int hp;
	private int mp;
	private int exp;
	private int level;
	private int power;
	private Sword sword; //캐릭터가 무기를 가지고 있음을 표현
	private Pet pet; //캐릭터가 펫을 가지고 있음을 표현
	
	public Character() {
		this.job = "마법사";
		this.hp = 100;
		this.mp = 50;
		this.exp = 0;
		this.level = 1;
		this.power = 10;
		this.pet = new Pet(); //캐릭터 생성하면서 동시에 펫 주기
	}
	
	public Character(String job, int hp, int mp, int exp, int level, int power) {
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.exp = exp;
		this.level = level;
		this.power = power;
	}
	
	// 구분선 ----------------------------------------------
	// info
	public void info() {
		System.out.println(this.getName());
		System.out.println(this.getJob());
		System.out.println(this.getHp());
		System.out.println(this.getMp());
		System.out.println(this.getExp());
		System.out.println(this.getLevel());
		System.out.println(this.getPower());
		System.out.println("====================================");
	}
	
	
	
	// 구분선 ----------------------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	
}
