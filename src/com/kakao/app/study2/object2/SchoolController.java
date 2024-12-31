package com.kakao.app.study2.object2;

import java.util.Scanner;

public class SchoolController {

	public void start () {
		
		//1. 학생 정보 입력 / 2. 학생 정보 출력 / 3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		SchoolMate mate = new SchoolMate();
		SchoolMateFactory factory = new SchoolMateFactory();				
		SchoolMateView view = new SchoolMateView();
		SchoolMate[] mates = new SchoolMate[0];
		
		while(flag) {
			System.out.println("=================================================");
			System.out.println("메뉴 선택을 해주세요.");
			System.out.println("1. 학생 정보 입력 / 2. 학생 정보 출력 / 3. 프로그램 종료");
			
			switch (sc.nextInt()) {
			
			case 1 : 
				mates = factory.make(mates); //기존 배열에 한칸 정보 추가하여 새로 대입
				break;
				
			case 2 : 
				view.viewAll(mates);
				break;
				
			default : System.out.println("프로그램을 종료합니다.");
				flag = !flag;
				
			
			}			
			
		}
		
	}
	
}
