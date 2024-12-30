package com.kakao.app;

public class Study2 {
	
	//변수. 하나의 값을 저장하는 메모리상의 공간
			//상수. 변하지 않는 값
			//리터럴. 변수에 대입하는 상수 데이터
			
			//변수 선언
			//데이터 타입 변수명(첫글자는 소문자)			
			
			//데이터 타입
			//1. 정수
			//byte(1바이트:127~-128) - bit 단위 작업을 할 때 사용
			//short(2바이트:32767~-32768) - C언어 호환 
			//int(4바이트:약 21억~-21억)
			//long(8바이트)
			
			//2. 실수
			//float(4바이트) : 소숫점 7자리까지 표현
			//double(8바이트) : 소숫점 15자리까지 표현

	public static void main (String[] args){
		
		System.out.println("프로그램이 시작됐습니다.");
				
		int kor; //4byte //OS에게 메모리에 4byte를 확보 지시 > 값은 아직 없는 상태
		long eng; //8byte
		//선언된 변수에 최초로 값을 대입하는 것
		
		//변수 선언과 동시에 초기화
		int money = 100000000;
		double money2 = 12345.12345;		
		long members = 500l;
		
		double score = 4.44;
		float score2 = 4.44f;
		
		System.out.println(money);
		
		//사용할 때는 변수명만 명시, 데이터 타입은 적을 필요 없음
		money = 700;
		
		System.out.println(money);
		
		money = money + 200;
		
		System.out.println(money);
		
		//문자 2바이트, 작성방식 > 리터럴 앞뒤로 ' ' 로 감싼다.
		char abc = 'a';
		char ab = '와';
		ab = 1;
		System.out.println(ab);
		
		//논리형 true, false > 사실 1bit(0 또는 1)만 있어도 되지만, 프로그래밍에서는 최소 단위가 1byte이다.
		boolean tf = true;
		
		//Primitive type(원시, 기본 타입 8종)
		
		//그 외 나머지 타입 : 참조 타입 (Reference type)
		//1. 문자열 타입 (String) 리터럴 앞뒤로 " " 로 감싼다.
		String lol = "abcde";
		String wow = "와우";
		
		System.out.println("프로그램이 종료됐습니다.");
		
		
		
		
		
	}
	
}
