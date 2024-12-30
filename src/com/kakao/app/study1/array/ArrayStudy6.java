package com.kakao.app.study1.array;

import java.util.Scanner;

public class ArrayStudy6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// 학생 수를 입력 받음
		
		// 학생 수만큼 학생 이름을 입력 받고, 출력
		
		System.out.println("학생 수를 입력해주세요.");
		int count = sc.nextInt();
		String [] students = new String[count];
		int [] scoreKor = new int[students.length];
		int [] scoreMath = new int[students.length];
		int [] scoreTotal = new int[students.length];
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(i+1+"번째 학생 이름 입력해주세요.");
			students[i] = sc.next(); 
			//다른 입력 메서드 쓴 후, nextLine()을 쓰면 먼저 입력 받은 값에서 '엔터 값'이 넘어와서 직후 nextLine()에 엔터 값이 들어가버린다.
			
		}
		//-----------------------------------------------
		// 학생 수만큼 국어 점수 입력
		// 입력한 이름의 국어 점수 입력
		
		for (int i = 0; i < students.length; i++) {			
			System.out.println("학생 " + students[i] + "의 국어 점수를 입력해주세요.");
			scoreKor[i] = sc.nextInt();
			
			System.out.println("학생 " + students[i] + "의 수학 점수를 입력해주세요.");
			scoreMath[i] = sc.nextInt();
			
			scoreTotal[i] = scoreKor[i] + scoreMath[i];
			
		}
		//-----------------------------------------------
		for (int i = 0; i < scoreTotal.length-1; i++) {
			System.out.println(i);
			
			for(int j = i+1; j < 5; j++) {
				System.out.print(j);
				
				String stuTemp = students[i];
				int korTemp = scoreKor[i];
				int mathTemp = scoreMath[i];
				int totalTemp = scoreTotal[i];
				 
				if(scoreTotal[i] < scoreTotal[j]) {
					scoreTotal[i] = scoreTotal[j];
					scoreTotal[j] = totalTemp;
				}
			}
			
			System.out.println();
			
		}
		
		
		
		//-----------------------------------------------
		for (int i = 0; i < students.length; i++) {
			
			System.out.println(students[i]+"의 국어 점수는 " + scoreKor[i] 
					+ "점, 수학 점수는 " + scoreMath[i] + "점, 총합 점수는 " + scoreTotal[i] + "점 입니다.");
			
		}
		
	}

}
