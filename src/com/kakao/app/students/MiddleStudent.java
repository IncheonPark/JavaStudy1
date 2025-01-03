package com.kakao.app.students;

public class MiddleStudent extends Student {	
	
	private int history; //역사 과목 한개 추가
	
	public MiddleStudent() {
		super(); //아무것도 안 적은 경우에는 기본적으로 디폴트로 선언되어 있다.
		
		super.setName("winter");
		System.out.println(super.getName());
		
		this.setName("IU");
		System.out.println(this.getName());
		
		System.out.println(super.getName()); //IU로 나온다. 이 경우는 super와 this가 같은 변수(주소)를 가리키기 때문 
	}
	
	
	
	public int getHistory() {
		return history;
	}
	
	public void setHistory(int history) {
		this.history = history;
	}
	
	
	
	

}
