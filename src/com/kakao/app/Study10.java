package com.kakao.app;

public class Study10 {
	
	/*
	 * 증감 연산자
	 * 1씩 증가 시키거나 1씩 감소 시킬 때 사용
	 * 
	 * 선행 연산자
	 * ++변수명
	 * 
	 * 후행 연산자
	 * 변수명++
	 * 
	 * 확장된 대입 연산자
	 * ex) num = num + 3;
	 * num += 3;
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int num = 0;
		System.out.println(num++);
		System.out.println(++num);
		
		num = 1;
		int result = 0;
		result = num++ + ++num;
		System.out.println(num);
		System.out.println(result); // result 0으로 나옴. 먼저 대입 시켰기 때문.
		
		num += 3;
		System.out.println(num);
		num =- 1; // -1을 대입 해버림 조심
		System.out.println(num);
		
	}

}
