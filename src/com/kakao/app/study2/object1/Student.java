package com.kakao.app.study2.object1;

public class Student {
	
	// 변수 및 메서드, 그리고 클래스 선언 양식
	// 접근 지정자 [그 외 지정자] 데이터타입 변수명;
	
	//---------------------------------------	
	
	// 특징 : 변수
	// ex) 학생 > 이름, 학번, 국어, 영어, 수학, 총점, 평균
	// Class 안에 선언된 변수들은 "멤버 변수(Instance 변수)"라 부르며, Heap영역 안에서 선언된다.
	// Reference, 지역변수, 참조변수
	
	String name; //레퍼런스 타입이면서, 인스턴스이다.
	int num; //기본 타입이면서, 인스턴스이다.
	int kor;
	int eng;
	int math;
	int total;
	double avg;	
	
	// 하는 일 : 메서드, 멤버 메서드(Instance 메서드)
	// 접근지정자 [그 외 지정자] 리턴타입 메서드명 ([매개변수들 선언]) {
	//		실행코드;
	// }
	
	public void info (int num1, double num2) {
		System.out.println("학생입니다.");
		//메서드 안에 두개의 숫자의 합을 계산하는 기능을 넣어보자.
		System.out.println(num1);
		
	}
	
	public void print () {
		System.out.println("학생 번호는 " + num + "입니다.");
	}
	

}
