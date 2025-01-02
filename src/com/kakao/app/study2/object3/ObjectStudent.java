package com.kakao.app.study2.object3;

public class ObjectStudent {

	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	// 생성자 -------------------------------------------------
	// 접근 제어자 (그외 지정자 : 안씀) (리턴 타입 : 안씀) 클래스명 ( ) { }
	
	// 기본 생성자 : 매개변수가 없는 생성자
	public ObjectStudent () {
		System.out.println("ObjectStudent 생성자 호출");
	}
	
	
	// 메서드 -------------------------------------------------
	
	public void info() {
		System.out.println("info 메서드 실행");
		
		//참조변수 this
		//객체가 생성할 시 만들어지는 변수
		//해당객체의 주소가 저장
		//this는 생략 가능
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(name);
		
		this.sum(); //같은 클래스 내 메서드에서 또 다른 메서드 호출 가능
		
	}
	
	public void sum() {
		System.out.println("sum 메서드 실행");
		//this.info() 를 넣어서 서로 부르면, 무한 반복이 일어나 버린다.
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3.0;
		
	}
	
	
	
	
}
