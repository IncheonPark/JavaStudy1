package com.kakao.app.study2.object2;

public class SchoolMateDelete {
	
	public SchoolMate[] delete (SchoolMate[] mates, SchoolMate mate) {
		
		SchoolMate[] afterMates = mates;
		SchoolMate[] realAfterMates = new SchoolMate[afterMates.length-1];
		
		for (int i = 0; i < afterMates.length; i++) {
			
			if (afterMates[i].num == mate.num) {
				afterMates[i].num = -100; //선별된 학생의 번호를 음수 100으로 바꾼다.
				 break;
			}
			
		}
		
		// afterMates의 학생들을 정렬한다 > 음수 학생이 맨 앞으로 간다.
		for (int i = 0; i < afterMates.length-1; i++) {
			System.out.println(i); //i 반복 횟수 확인용 출력문
			
			for(int j = i+1; j < afterMates.length; j++) {
				System.out.print(j); //j 반복 횟수 확인용 출력문
				
				SchoolMate tempMate = afterMates[i];
				 
				if(afterMates[i].num > afterMates[j].num) {
					
					afterMates[i] = afterMates[j];
					afterMates[j] = tempMate;
					
				}
			}
			
			System.out.println();
			
		}
		
		System.out.println(afterMates[0].num); //학생이 1명일 때 num확인용 출력문
		
		// 정렬된 afterMates의 인덱스 0번 학생을 제외한 나머지 학생들을 배열에 새로 대입한다.
		for (int i = 1; i < afterMates.length; i++) {
			realAfterMates[i-1] = afterMates[i];
		}
		
		
		return realAfterMates;
		
	}

}
