package com.kakao.app.zoo;

public abstract class Animal {
	
	private String name;
	private int age;
	
	public final void info() {
		System.out.println("final"); //상속은 되지만 오버라이드 할 수 없다.
	}
	
	
	// 추상 메서드
	public abstract void eat();		
	public abstract void sleep(); 
	public abstract void play();
	public abstract void poo();

}
