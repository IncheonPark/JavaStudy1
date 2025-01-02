package com.kakao.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	private Scanner sc; // 스캐너를 멤버 변수로 선언
	
	public SchoolMateFactory() { // 생성자로 스캐너 객체 생성 
		this.sc = new Scanner(System.in);
	}
	
	// make 메서드 선언
	// Schoolmate 객체를 생성 및 모든 정보를 입력 받아서 대입한다.
	public SchoolMate[] make (SchoolMate [] mates) {
		
		SchoolMate mate = new SchoolMate();
				
		System.out.println("이름을 입력해주세요.");
		mate.name = sc.next();
		System.out.println("학번을 입력해주세요.");
		mate.num = sc.nextInt();
		System.out.println("국어 점수를 입력해주세요.");
		mate.kor = sc.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		mate.eng = sc.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		mate.math = sc.nextInt();
		
		mate.total = mate.kor + mate.eng + mate.math;
		mate.avg = mate.total / 3.0;
		
		//-------------------------------------------
		SchoolMate[] temps = mates;
		SchoolMate[] mates2 = new SchoolMate[mates.length+1];
		mates = mates2; // +1칸 짜리 배열 덮어 씌웠고, 다 공백이다.
		
		for (int i = 0; i < temps.length; i++) {
			mates[i] = temps[i]; //새로 생긴 공백 배열에 temps로 옮겨 놨던 기존 데이터들 입력
		}
		
		mates[mates.length-1] = mate; //마지막 칸 채움
		
		//-------------------------------------------
		return mates; //최종 처리된 배열을 리턴
		
		
	}
	
	//2. 검색 기능 만들기-------------------------------------------
	public SchoolMate find(SchoolMate[] mates) {
		System.out.println("학생 번호 입력");		
		int checkNum = sc.nextInt();
		SchoolMate mate = null;
		
		for (int i = 0; i < mates.length; i++) {
			
			if(mates[i].num == checkNum) {
				mate = mates[i];
				break;
				
			}
			
		} //mate가 null인 상태로 학생을 못 찾고 for문이 끝날 수 있다. > Controller에 필터링용 if문 한개 만들어뒀음.
		
		return mate;
		
	}
	
	//3. 수업 버전 delete() 기능
	public SchoolMate[] delete2(SchoolMate [] mates) {
		
		System.out.println("삭제할 번호 입력");
		int select = sc.nextInt();
		SchoolMate[] copyMates = new SchoolMate[mates.length-1]; //새로 넣을 한칸 적은 배열 생성
		
		for (int i=0; i < mates.length; i++) {
			
			if(select == mates[i].num) {
				
				//수업 버전 delete() 기능 1번.
				
				int idx = 0; //copyMates에 들어갈 인덱스, num이 일치할 경우 j보다 1이 적어야한다.
				
				for(int j=0; j < mates.length; j++) {
					if (i == j) {
						continue;
					}
					copyMates[idx] = mates[j]; //copyMates[j] = mates[j]; j가 똑같으면 안됨
					idx++;
				}
				
			}
			
			break;
			
		}
		
		return copyMates;
		
	}
	
	
	
}
