package com.kakao.app;

public class Study4 {
	
	//형변환 (Casting, 데이터 타입 변환) : 기본타입끼리만 가능, 단 boolean은 안됨
	/*
	 * 1. 자동 형변환 : 값의 변화가 없음
	 * 
	 * 2. 강제 형변환 : 값의 변화가 있을 수 있다. > 작성 방식 - (변환할 타입명)변수명
	 * 
	 * ---------------------
	 * OverFlow와 UnderFlow
	 * OverFlow : 표현할 수 있는 최대값을 넘어가면 최소값으로 이동
	 * UnderFlow : 표현할 수 있는 최고값을 넘어가면 최대값으로 이동
	 * 
	 * */
	public static void main (String[] args) {
		
		char ch = 'b';
		int num = ch;
		
		num = 99;
		//short = char는 부호비트가 없어서 자동 형변환이 안된다.
		
		ch = (char)num;
		
		System.out.println(num);
		System.out.println(ch);
		
		double d = 23.56;
		
		num = (int)d;
		System.out.println(num);
		num = 5;
		d = num;
		System.out.println(d);
		
		long n1 = 0L;
		float f1 = 0.0F;
		
		// n1 = f1; (float가 용량은 적으나, 수의 표현 경우의 수가 더 많아, 자동 형변환이 안된다.)
		
		
	}

}
