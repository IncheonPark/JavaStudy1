package com.kakao.app.study2.object4;

public class Member {
	
	// DTO (Data Transfer Object)
	// VO (Value Object)

	// ex) 비만 관리 프로그램용 정보 클래스
	// 멤버변수 초기화 순서
	
	private String name;
	private int age = 10;
	private double muge;
	private double ki;
	private String email;
	
	{
		// instance 초기화 블럭
		// 멤버변수의 값을 초기화 할 때 사용
		this.age = 20;
	}
	
	public Member() {
		this.age = 30;
	}
	
	
	
	//----------------------------------------------
	
	// Setter : Data를 변수에 넣는 메서드 set변수명
	// Getter : Data를 외부로 보내는 메서드 get변수명
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMuge(double muge) {
		if (muge > 30 && muge < 150) {
			this.muge = muge;
		}
				
	}
	
	public double getMuge() {
		return this.muge;
	}
	
	public void setKi(double ki) {
		if (ki > 100 && ki < 250) {
			this.ki = ki;
		}
	}
	
	public double getKi() {
		return this.ki;
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
	
	
}
