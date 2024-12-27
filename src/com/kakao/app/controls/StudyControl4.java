package com.kakao.app.controls;

public class StudyControl4 {
	
	/* 여러개 중 하나 선택
	 * switch case문
	 * 
	 * switch (정수식 또는 문자열) {
	 * 		case 정수 또는 문자열 : 
	 * 		break;
	 * 
	 * 		case 정수 또는 문자열 : 
	 * 		break;
	 * 
	 * 		case 정수 또는 문자열 : 
	 * 		break;
	 * 
	 * 		.....
	 * 
	 * 		default : 
	 * }
	 * 
	 *  
	 * 
	 * */
	
	public static void main(String[] args) {
		
		System.out.println("시작");
		
		int num = 1;
		
		switch(num * 2) {
		case 1 : // 정수식의 결과물이 1일 때 실행
			break;
		case 2 : // "
			break;
		case 10 : // "
			break;
		default : // 정수식의 결과가 case중 하나에 해당 하거나 또는 어떤 case에도 일치하지 않는 경우
			
		}
		
		//-------------------------------------------
		int avg = 79;
		String score = "";
		
		switch(avg/10) {
		case 10 :
		case 9 : score = "A학점";
		break;
		case 8 : score = "B학점";
		break;
		case 7 : score = "C학점";
		break;
		case 6 : score = "D학점";
		break;
		default : score = "F학점";
		}
		
		System.out.println("점수는 "+avg);
		System.out.println(score);
				
		System.out.println("마침");
		
	}

}
