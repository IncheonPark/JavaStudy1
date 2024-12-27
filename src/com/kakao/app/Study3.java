package com.kakao.app;

public class Study3 {
	
	public static void main (String[] args) {
		
		//변수명의 첫글자는 무조건 소문자로 시작
		//두 단어 이상으로 만들어질 때는 두번째 단어의 첫글자를 대문자로 한다. Camel Case 형식
		//
		//길어도 상관없고, 이름의 의미가 있도록 만든다.
		int maxLevel; //Camel Case 낙타 형식
		int max_level; //Snake Case 뱀 형식
		//특수문자는 _ , $만 사용 가능
		//숫자 사용 가능 (첫글자로 사용 불가능)
		int _max;
		int $max;
		//int 1max; 불가능
		int 하이; //사용 가능하지만, 깨질 수 있어 영어 권장
		
		//정수형은 초기 값을 0으로 대입한다, 넣을 거 없을 시.
		//타입별 기본값들
		int age = 0;
		long lo = 0L;
		
		float f = 0.0F;
		double d = 0.0;
		
		char ch = ' ';
		
		boolean check = false;
		
		String name = null;
		
		byte b1 = 120;
		byte b2 = 1;
		byte b3 = (byte) (b1 + b2);
		
		System.out.println(b3);
		
		
	}
	

}
