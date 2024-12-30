package com.kakao.app.controls;

import java.util.Scanner;

public class StudyControl2 {

	/*  if ~ else 둘 중 하나를 선택 하는 조건문
	 * if (조건식) {
	 * 		조건식이 true일 때 실행
	 * } else {
	 * 		조건식이 false일 때 실행
	 * }
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int num = 1;
		int age = 0;
		
		if (num > 0 ) {
			num ++;
			age = 20; //지역변수 : 중괄호 안에 선언된 변수
			age++;
		} else {
			System.out.println("num은 음수입니다.");
		}
		
		System.out.println(num);
		System.out.println(age);
		
		//------------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		
		System.out.println("아이디를 입력하세요. 4자리");
		int idInput = sc.nextInt();
		
		System.out.println("비밀번호를 입력하세요. 4자리");
		int pwInput = sc.nextInt();
		
		//-----------------------------------
		
		if (id == idInput) {			
			
			if (pw == pwInput) {
				System.out.println("아이디 일치");
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");				
			} else {
				System.out.println("아이디 일치");
				System.out.println("비밀번호 불일치");
				System.out.println("로그인 실패");				
			}
			
		} else {
			System.out.println("아이디 불일치");
			System.out.println("로그인 실패");
		}
		
		
		
		
		System.out.println("프로그램 종료");
		
	}
	
}
