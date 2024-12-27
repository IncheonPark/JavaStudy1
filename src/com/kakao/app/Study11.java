package com.kakao.app;

public class Study11 {

	/*
	 * 삼항 연산자
	 * 조건식은 결과물이 boolean
	 * 변수 = 조건식 ? 조건식이 true라면 실행 : 조건식이 false일 때 실행;
	 * 
	 * 
	 * 비트 논리 연산자
	 * &(and), |(OR), ~(NOT)
	 * 0은 false, 1은 true로 생각하자.
	 * 
	 * 
	 * 쉬프트 연산자
	 * 3 << 2 의 결과 값은 12이다.
	 * 정수 3을 2비트만큼 왼쪽으로 밀고, 빈칸은 0으로 채움
	 * 
	 * 3 >> 2
	 * 양의 정수였다면 빈칸을 0으로 채우고
	 * 음의 정수였다면 빈칸을 1로 채운다.
	 * 
	 * 3 >>> 2
	 * 정수 3을 2비트만큼 오른쪽으로 밀고
	 * 음수든 양수든 상관없이 빈칸을 0으로 채움
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		//나이를 입력 받아서 미성년자 구분
		int age = 18;
		
		String answer = age > 19 ? "성년" : "미성년";
		System.out.println(answer);
		
		int price = 20000;
		// 가격이 3만원 이상 구매 시 배달료 무료, 아니라면 배달료 2500원 추가
		int total = price >= 30000 ? price : price+2500;
		System.out.println(total);
		
		System.out.println(3 & 2 ); //(칸 별로 1, 0을 비교하여 2진수로 표현)
		System.out.println(~2); //칸 별로 1, 0을 반대로 바꿈
		
	}
		
}
