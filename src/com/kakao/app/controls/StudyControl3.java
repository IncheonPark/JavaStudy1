package com.kakao.app.controls;

public class StudyControl3 {
	
	/* 조건문 여러개 중 하나를 선택
	 * if (조건식1) {
	 * 		조건식1이 true일 때 실행
	 * } else if (조건식2) {
	 * 		조건식2가 true일 때 실행
	 * } else if (조건식n) {
	 * 		조건식n이 true일 때 실행
	 * } else {
	 * 
	 * }
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		int avg = 100;
		String score = "";
		
		if (avg >= 90) {
			score = "A학점";
		} else if (avg >= 80) {
			score = "B학점";
		} else if (avg >= 70) {
			score = "C학점";
		} else if (avg >= 60) {
			score = "D학점";
		} else {
			score = "F학점";
		}
		System.out.println(score);
		System.out.println("점수는 " + avg);
		
		
		System.out.println("프로그램 종료");
		
	}

}
