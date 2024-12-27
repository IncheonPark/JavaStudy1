package com.kakao.app.controls;

import java.util.Scanner;

public class StudyLoop7 {

	/* while (조건식) {
	 * 		조건식이 true일 때 실행하는 영역
	 * }
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {

		// 메뉴 시키는 키오스크 만들기
		// 1. 정보입력, 2. 정보수정, 3. 정보출력, 4. 프로그램 종료
		// 4번 누르기 전까지 > 계속 선택 메뉴 띄우기
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag) {			
			System.out.println("1. 정보입력 / 2. 정보수정 / 3. 정보출력 / 4. 프로그램 종료");
			int select = sc.nextInt();
			
			switch (select) {
			
			case 1: System.out.println("정보입력");
				break;
			case 2: System.out.println("정보수정");
				break;
			case 3: System.out.println("정보출력");
				break;
			case 4: System.out.println("종료");
				flag = !flag;
				break;
				
			default: System.out.println("다시 입력하세요");
				
			}
			
		}

	}

}
