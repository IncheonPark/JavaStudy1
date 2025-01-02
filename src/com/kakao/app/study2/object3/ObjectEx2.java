package com.kakao.app.study2.object3;

public class ObjectEx2 {
		
	// 메서드 오버로딩 (method Overloading) 배워보기
	// 같은 이름의 메서드를 여러개 만드는 것
	// 
	
	// 오버로딩의 조건.
	// 1. 메서드의 이름은 같게 만든다.
	// 2. 매개변수의 갯수 또는 타입을 다르게 만든다.
	// 3. 메서드의 내용은 달라도 상관 없다.
	// 4. 리턴 타입이나 접근 지정자는 달라도 상관 없음
	
	public void sum(int num1) {
		
		System.out.println(num1);
		
	}
	
	public void sum(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	public void sum(int num1, long num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	public void sum(int num1, float num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	public void sum(int num1, double num2) {
		
		System.out.println(num1 + num2);
		
	}
	
	// 매개 변수 타입 순서가 달라도, 다른 메서드로 인식한다.
	public void sum(double num1, int num2) {
		
		System.out.println(num1 + num2);
		
	}
	
}
