package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop2 {
	
	public static void main(String[] args) {
		
		//for(초기식; 조건식; 증감식){ }
		
		//사물 빗대어 구현 해보기
		//ex) 시계 : 0초~59초
		Scanner sc = new Scanner(System.in);
//		System.out.println("0부터 600까지 초를 입력하세요.");
//		
//		int sec = sc.nextInt();		
//		int mit = -1;
//		for (int i =0; i < 600; i++) {
//			System.out.println(i+"초 입니다.");
//			
//			if(i % 60 == 0) {
//				mit++;
//				System.out.println("현재 "+mit+"분 입니다.");
//			}
//			
//			if (i == sec) {
//				i = 700;
//			}
//			
//		}
	//-------------------------------------------------
		//로그인 성공하기 구현. 최대 5번의 기회, 5번 내에 성공하면 로그인 성공 출력, 초과 시 은행 방문 요청 출력 후 종료
		int id = 1234;
		int pw = 5678;
		
		
		for (int i = 0; i < 6; i++) {
			
			if(i >= 5) {
				System.out.println("틀린 횟수 5회 이상 발생, 은행 방문하여 확인해주시기 바랍니다.");
				i = 100;
				
			} else {
				System.out.println("아이디를 입력하세요.");
				int inputId = sc.nextInt();
				
				System.out.println("비밀번호를 입력하세요.");
				int inputPw = sc.nextInt();
				
				//----------------------------------------------------
				if(id == inputId && pw == inputPw) {
					System.out.println("로그인에 성공하였습니다.");
					i = 100;
				} else {
					//wrongCount++;
					System.out.println("입력 불일치, 로그인 실패하였습니다. 틀린 횟수 :"+(i+1));
				}
				//----------------------------------------------------
			}
			
			
			
		}
		
		
		
	}

}
