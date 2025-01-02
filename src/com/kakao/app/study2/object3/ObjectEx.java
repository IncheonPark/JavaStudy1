package com.kakao.app.study2.object3;

public class ObjectEx {

	int num1;
	int num2;
	
	public ObjectEx () {
		
	}
	
	public void eq(ObjectEx ex1, ObjectEx ex2) {
 
		System.out.println("비교 메서드 eq 실행");
		System.out.println("num1 비교");
		System.out.println(ex1.num1 == ex2.num1);
		
		System.out.println("num2 비교");
		System.out.println(ex1.num2 == ex2.num2);
		
	}
	
	public void eq2(ObjectEx ex) {
		
		// this를 써서 매개변수로 ex를 한개만 받아와도 연산 가능하다.
		System.out.println("비교 메서드 eq2 실행");
		System.out.println(this.num1 == ex.num1 && this.num2 == ex.num2);
		
		
	}
	
}
