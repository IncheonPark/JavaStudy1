package com.kakao.app.study2.object1;

public class StudentFactory {
	
	//리턴 타입 있는 메서드 만들어보기
	//void는 리턴 타입이 없다는 소리, int 타입 리턴할 거면 int로 적는다.
	public int t1(int num, int num2) {
		
		int sum = num + num2;
		int avg = sum/2;
		
		//리턴은 한개의 값만 가능
		
		//메서드의 종료 : {} 끝을 만나거나, return을 만났을 때
		if(sum < 0) {
			return sum;
		}
		
		return sum+3/2;
		
	}
	
	public String t2() {
		
		return "";
		
	}
	
	public void t3(int num) {
		
		if(num<0) {
			return; //데이터가 없어도 void타입 메서드에서 return 사용 가능
		}
		
	}
	
	
	
	
	
	
}
