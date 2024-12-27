package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop6 {
	
	/* 시계 구현하기
	 * 0분 0초부터 시작
	 * 0분 59초
	 * 1분 0초
	 * 
	 * 59분 59초에 끝남
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		
		System.out.println("시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요.");
		int min = sc.nextInt();
		
		System.out.println("초를 입력하세요.");
		int sec = sc.nextInt();
		
		for (int i = 0; i < 60; i++) {
			
			for(int j = 0; j < 60; j++) {
				
				System.out.println(i + "분 " + j + "초");
				if (i == min && j == sec) {
					i = 100; break;
				}
				
			}
			
		}
		
		System.out.println("종료");
		
	}
	
}
