package com.kakao.app;

import java.util.Scanner;

public class Study9 {

	/*
	 * 1. 비교 연산자 (관계 연산자) 결과물은 boolean(true, false) ex) <, >, ==, <=, >=, !=
	 * 
	 * 
	 * ==, != 는 기본타입에서는 괜찮음, 참조타입에서는 결과가 다를 수 있어 주의.
	 * 
	 * ---------------------------------------------------------
	 * 2. 논리 연산자
	 * boolean type끼리 연산 : 결과물은 boolean
	 * && : and
	 * || : OR
	 * ! : NOT (단항 연산자)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 30;
		int b = 10;
		boolean result = a > b;
		String name = "iu";

		System.out.println("이름 입력");
		String name3 = sc.next();
		System.out.println(name == name3);

	}

}
