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
		SchoolMateDelete delete = new SchoolMateDelete();
		SchoolMate[] mates = new SchoolMate[0];
		
		while(flag) {
			System.out.println("=================================================");
			System.out.println("메뉴 선택을 해주세요.");
			System.out.println("1. 학생 정보 입력 / 2. 학생 정보 출력 / 3. 특정 학생 찾기 (번호 입력) / "
					+ "4. 특정 학생 삭제 (번호 입력) / 5. 프로그램 종료");
			// 여유가 되면 4번 메뉴 특정 학생 삭제 (학생 삭제 및 배열칸 1개 줄이기 만들어볼 것)
			// 특정 번호의 학생을 찾고, 그 칸의 번호(num)를 음수로 바꾼다 > 배열 중 제일 작은 수가 될 것이다 > 배열을 오름차순으로 정렬
			// > 새로운 배열(한칸 적은 배열)을 만들어서 이전 배열의 요소들을 대입
			// > 인덱스를 1번부터 시작한다 > 맨 앞의 요소 날아감 > 수정된 배열 생성 완료
			
			switch (sc.nextInt()) {
			
			case 1 : 
				mates = factory.make(mates); //기존 배열에 한칸 정보 추가하여 새로 대입
				break;
				
			case 2 : 
				view.viewAll(mates);
				break;
			
			case 3 :
				 mate = factory.find(mates);
				 
				 if (mate != null) {
					 view.view(mate);					 
				 } else {
					 System.out.println("일치하는 학생이 없습니다.");
				 }
				break;
				 
			case 4 : 
				mate = factory.find(mates);
			
				if (mate != null) {
					mates = delete.delete(mates, mate); 
					//mates배열에 학생을 지우고 난 배열을 새로 넣어준다.
				} else {
					 System.out.println("일치하는 학생이 없습니다.");
				}
				break;
				
			default : System.out.println("프로그램을 종료합니다.");
				flag = !flag;
				
			
			}			
			
		}
		
	}
	
}
