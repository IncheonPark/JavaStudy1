package com.kakao.app.controls;

import java.util.Scanner;

public class StudyControl1 {

	/*
	 * 제어문
	 * 1. 단일 if문
	 * if (조건식) {
	 * 	실행문, 조건식이 true일 때 실행
	 * }
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		int num = 2;
		
		if(num % 2 == 0) {
			System.out.println(num+"은(는) 짝수입니다.");
		}
		
		System.out.println("프로그램 종료");
		//---------------------------------------------
		//국어, 영어, 수학 3과목 점수를 입력 받아, 총점과 평균을 계산 후에 90점 이상이면 "우수상 수상" 출력
		
		Scanner sc = new Scanner(System.in);
		int errorCount = 0;
		
		System.out.println("국어 점수 입력");
		int kor = sc.nextInt();
		if (0 > kor || kor > 100) {
			System.out.println("국어 점수 값이 0미만 또는 100초과입니다. 맞게 입력해주세요.");
			errorCount++;
		}
		
		System.out.println("영어 점수 입력");
		int eng = sc.nextInt();
		if (0 > eng || eng > 100) {
			System.out.println("영어 점수 값이 0미만 또는 100초과입니다. 맞게 입력해주세요.");
			errorCount++;
		}
		
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		if (0 > math || math > 100) {
			System.out.println("수학 점수 값이 0미만 또는 100초과입니다. 맞게 입력해주세요.");
			errorCount++;
		}
		
		int sum = kor + eng + math;
		int avg = sum / 3;
		//---------------------------------------------------
		if (errorCount == 0) {
			
			if (avg >= 90) {
				System.out.print("A학점, ");
			}			
			if (avg < 90 && avg >= 80) {
				System.out.print("B학점, ");
			}
			if (avg < 80 && avg >= 70) {
				System.out.print("C학점, ");
			}
			if (avg < 70 && avg >= 60) {
				System.out.print("D학점, ");
			}
			if (avg < 60) {
				System.out.print("F학점, ");
		
			}
			
			
			System.out.println(avg+"점 입니다.");
		}
		//---------------------------------------------------
		if (errorCount > 0) {
			System.out.println("에러 : 점수 입력 범위 벗어남");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
