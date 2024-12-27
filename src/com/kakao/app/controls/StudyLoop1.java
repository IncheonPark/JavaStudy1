package com.kakao.app.controls;

public class StudyLoop1 {

	/* 반복 작업
	 * 1. for, 2. while
	 * 
	 * for ~하는 동안 계속 한다.
	 * for(초기식; 조건식; 증감식){
	 * 		조건식이 true일 때 실행하는 코드
	 * }
	 * 
	 * 순서 > 초기식 진행 > 조건식이 true라면 영역 내 코드 실행 > 증감식 실행 > 조건식 진행 (이후 반복), false라면 for문 전체 종료
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("시작");
		
		for(int i = 0; i < 10; i++) {
			//0~9, 짝수만 출력
			if (i % 2 == 0) {
				System.out.println(i+"hello");
			}
			
		}
		
		//-----------------------------------------------
		for(int i = 0; i < 10; i=i+2) {
			System.out.println(i);
		}
		
		//------------------------------------------------
		
		int count = 5;
		//누적 함수
		//0+1+2+3+4+5 => 15가 나온다.
		//두 수를 합친 값을 저장할 수 있는 변수가 필요하다. 여기서는 sum으로 정의해본다.
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		
		
		System.out.println("마침");
		
		
	}
	
}
