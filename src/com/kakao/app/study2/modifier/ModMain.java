package com.kakao.app.study2.modifier;

public class ModMain {
	
	//main 메서드가 static인 이유는 객체를 생성하지 않고 첫 시작을 끊어야할 메서드가 필요하기 때문이다.
	//static을 사용하지 않으면 메서드 안에 객체를 선언해야하기 때문에 메서드 선언, 객체 생성이 계속 반복되고, 시작을 알 수 없다.
	public static void main(String[] args) {
				
		Test test = new Test();
		
		test.num1 = 30;
		Test.num3 = 1010;
		System.out.println(Test.num3);
		test.m1();
		
		System.out.println(Test2.num2); 
		// static은 클래스로 바로 접근한다. 메모리 중 메서드 영역에 생성돼서 부를 주소가 없음.
		// 클래스 변수라고도 부름
		// 변수는 클래스 변수(메서드 영역), 지역 변수(스택 영역), 인스턴스 변수(힙 영역)로 나뉜다.
		Test2.m2();
		
		Test test2 = new Test();
		
		System.out.println("=======================");
		System.out.println(Test.num3);
		test2.m1();
		
		System.out.println("=======================");
		Test3 t3 = Test3.getInstance();
		t3.getName();
		t3.setName("");
		

	}

}
