package com.kakao.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {

	public static void main(String[] args) {
		
		// 한 반에서 국어 시험의 결과를 저장하려고 한다.
		// 학생 수는 4명
		// 국어의 총점과 평균을 계산, 값은 키보드로 입력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		double avg = 0;
		
		System.out.println("학생 수를 입력하세요.");
		int [] score = new int[sc.nextInt()];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("국어 점수 값을 입력하세요.");
			score[i] = sc.nextInt();
			System.out.println(score.length + "명 중, " + (i+1) + "명 입력 완료");
		}
		
		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		
		avg = total / (score.length * 1.0);
		
		System.out.println("총점은 : " + total);
		System.out.println("평균은 : " + avg);
		
	}
	
}
