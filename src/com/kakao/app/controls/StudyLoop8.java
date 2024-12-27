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
					flag = !flag;
					
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
		
	}

}
