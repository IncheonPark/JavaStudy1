package com.kakao.app.study2.modifier;

public class Test2 {
	
	public static int num2;
	
	static {
		//초기화 블럭 앞에 static을 붙여 사용할 수 있다.
		Test2.num2 = 30;
	}
	
	
	public static void m2() {
		System.out.println("스태틱 메서드");
	}

}
