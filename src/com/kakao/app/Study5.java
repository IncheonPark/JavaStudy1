package com.kakao.app;

import java.util.Scanner;

public class Study5 {
	
	// 연산자
	// 산술 연산자 : +, -, *, /, %
	// 연결 연산자 : + (문자열과 함께 쓸 때)
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int n1 = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int n2 = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int n3 = sc.nextInt();
		
		int total = n1 + n2 + n3;
		double average = (double)total / 3;
		//double average = total / 3.0;
		
		System.out.println("국어 점수는 "+n1);
		System.out.println("수학 점수는 "+n2);
		System.out.println("영어 점수는 "+n3);
		System.out.println("세과목 점수 총합은 "+total);
		System.out.println("세과목 점수 평균은 "+average);
		
		System.out.println("프로그램 종료");
		
	}

}
