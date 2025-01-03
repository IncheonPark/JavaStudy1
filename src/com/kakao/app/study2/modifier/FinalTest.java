package com.kakao.app.study2.modifier;

// 클래스에 final : 상속을 하지 말라는 얘기 (부모로 사용 금지)
public final class FinalTest {
	
	// 변수에 final : 상수로 사용(한번 들어간 값은 변경 금지)
	// 원래 변수 명명규칙은 소문자 시작 및 camel case이지만
	// 상수형은 모두 대문자로 사용 및 snake case형식을 사용
	private final int MAX_NUM;
	private static final int MAX_NUM2 = 20;
	// 그외 지정자는 두개 사용 가능 (의미가 통한다면)
	
	public FinalTest() {
		MAX_NUM = 10;
	}
	
	// 메서드에 final : 상속에서 오버라이딩 금지
	public final void m1() {
		//지역 변수도 final 사용 가능
		final int n = 2;
		
		
		
	}

}
