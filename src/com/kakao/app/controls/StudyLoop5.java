package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop5 {

	/* FPS 미니 게임 구현
	 * 총알은 한 탄창에 30발
	 * 단발 발사는 1개 소모, 점사 발사는 3개 소모
	 * 
	 * 1을 입력하면 단발 모드, 2를 입력하면 점사 모드 변경
	 * 
	 * 탄창이 비워지면 탄창 교체 필요. 탄창은 3개 소지
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("시작");
		
		Scanner sc = new Scanner(System.in);		
		
		for (int i = 0; i < 3; i++) { //탄창이 3개 이므로 3번 반복
			
			System.out.println("남은 탄창 갯수 : " + (3-i) + "개");
			System.out.println("발사 모드를 선택하세요. 1: 단발 / 3: 점사");
			
			int mod = sc.nextInt();
			
			if (!(mod == 1 || mod == 3)) {
				System.out.println("모드를 똑바로 선택해주세요.");
				i = i-1; continue;
			}
			
			for (int j = 0; j < 30; j = j + mod) {
				
				if (mod == 1) {
					System.out.println("탕!");
				} else {
					System.out.println("탕탕탕!");
				}			
				
				
			}
			
			
		}
		
		
		System.out.println("종료");
		
	}
	
}
