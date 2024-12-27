package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop9 {

	/* MMORPG 미니게임 만들어보기
	 * 레벨 1부터 15레벨까지 만렙이다.
	 * 모든 몬스터는 경험치가 동일하다.
	 * 
	 * 레벨 1 -> 레벨 2 까지 필요한 사냥 수 3마리
	 * 레벨 2 -> 레벨 3 까지 필요한 사냥 수 6마리
	 * 레벨 3 -> 레벨 4 까지 필요한 사냥 수 9마리
	 * 레벨 4 -> 레벨 5 까지 필요한 사냥 수 12마리
	 * 레벨 14 -> 레벨 15 까지 필요한 사냥 수 42마리
	 * 
	 * 골드 : 0 부터 시작
	 * 레벨이 5 달성 시 1천 골드 보너스 지급
	 * 레벨이 10 달성 시 2천 골드 보너스 지급
	 * 레벨이 15 달성 시 3천 골드 보너스 지급 
	 * 
	 * */
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		//1번 사냥, 2번 종료
//		int gold = 0;
//		//-----------------------------------------------------
//		for (int i = 1; i <= 15; i++) {
//						
//			if (i > 1) {
//				System.out.println("---------------------------------");
//				
//				if (i % 5 == 0) {
//					gold = gold + (i/5 * 1000);
//					System.out.println("5레벨씩 상승할 때마다 보너스 골드 지급! - 지급량 : " + (i/5 * 1000) + "골드");
//				}
//				System.out.println("레벨업! 현재 레벨 : " + i + " / 현재 골드 : " + gold);
//				//-----------------------------------------------------
//				if (i == 15) {
//					break;
//				}
//			}
//			
//			System.out.println("1. 몬스터 사냥 / 2. 게임 종료 ");
//			int menu = sc.nextInt();
//			
//			if (menu == 1) {
//				for (int j = 0; j < i * 3; j++) {
//					System.out.println(j+1+"마리 몬스터를 사냥했습니다.");
//					
//				}
//			} else {				
//				break;
//			}
//			
//		} System.out.println("게임을 종료합니다.");
		
		int level = 1;
		int gold = 0;
		
		for(level = 1; level < 15; level++) {
			
			for (int mon = 1; mon <=3; mon++) {
				System.out.println(mon + "마리 사냥 성공.");
			}
			
			System.out.println("축 레벨업!");
			
			if((level+1)%5 == 0) {
				gold = gold + (level+1) /5 * 1000;
			}
			
		}
		System.out.println("현재 레벨 : " + level);
		System.out.println("현재 골드 : " + gold);

	}

}
