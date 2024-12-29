package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234; 
		int pw = 5678;
		int inputId = 0; 
		int inputPw = 0;
		
		boolean flag = true;	
		
		// 1. 로그인 시도 / 2. 프로그램 종료 기능을 가진 기능 구현하기
		
		while (flag) {			
			System.out.println("메뉴를 고르세요. 1. 로그인 / 2. 프로그램 종료");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.println("아이디를 입력하세요.");
				inputId = sc.nextInt();
				System.out.println("비밀번호를 입력하세요.");
				inputPw = sc.nextInt();
				//-------------------------------------------------------
				if (id == inputId && pw == inputPw) {
					System.out.println("로그인 성공했습니다.");
					break;
					
				} else {
					System.out.println("로그인 실패. 처음으로 돌아갑니다.");
				}
				//---------------------------------------------------------
			} else if (menu == 2) {
				System.out.println("종료합니다.");
				flag = !flag;
			} else {
				System.out.println("메뉴 입력을 똑바로 해주세요.");
			}
			
		}
		//로그인 성공 시 아래 코드 실행 -------------------------------------------------
		if (flag) { //flag가 true이다 > 로그인 성공했다라는 의미			
			
			int gold = 0;
			
			//-----------------------------------------------------
			for (int i = 1; i <= 15; i++) {
							
				if (i > 1) {
					System.out.println("---------------------------------");
					
					if (i % 5 == 0) {
						gold = gold + (i/5 * 1000);
						System.out.println("5레벨씩 상승할 때마다 보너스 골드 지급! - 지급량 : " + (i/5 * 1000) + "골드");
					}
					System.out.println("레벨업! 현재 레벨 : " + i + " / 현재 골드 : " + gold);
					//-----------------------------------------------------
					if (i == 15) {
						break;
					}
				}
				
				System.out.println("1. 몬스터 사냥 / 2. 게임 종료 ");
				int menu = sc.nextInt();
				
				if (menu == 1) {
					for (int j = 0; j < i * 3; j++) {
						System.out.println(j+1+"마리 몬스터를 사냥했습니다.");
						
					}
				} else {				
					break;
				}
																							
				} System.out.println("게임을 종료합니다.");
				//LOL
				
		}
			
		
		
		
		
	}

}
