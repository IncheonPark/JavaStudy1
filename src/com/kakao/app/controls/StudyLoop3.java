package com.kakao.app.controls;

public class StudyLoop3 {

	/* 반복문 내에서 사용하는 보조문
	 * 1. break;
	 * break는 즉시 반복문을 종료시킨다.
	 * 
	 * 2. continue;
	 * for문 > continue는 즉시 반복문을 증감식으로 이동시킨다.
	 * while > continue는 즉시 반복문을 조건식으로 이동시킨다.
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		int count = 3;
		for(int i =0 ; i < 10; i ++) {
			
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
			
			if(i == count) {
				break;
			}
			System.out.println(i);
			
		}
		
	}
	
}
