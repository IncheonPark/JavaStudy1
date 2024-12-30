package com.kakao.app.study1.array;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//모든 레퍼런스 타입의 메모리 크기는 4바이트
		//new 키워드는 Heap(실제 데이터가 있는 곳)에 만든다는 얘기
		
		int [] nums = new int [3];
		//Heap에다가 int타입을 3개 연속으로 만드세요, nums(Stack 내 main에 위치, 즉 지역변수)에는 생성된 메모리의 첫번째 주소를 저장
		nums [0] = 20;
		
		
		double [] avgs = new double [3];
		avgs [1] = 3.12;
		
		String name = ""; //String은 참조 타입이지만, 예외적으로 편의성을 위해 바로 데이터를 출력하도록 만들어졌다.
		
		System.out.println(nums[1]); //default값은 0이다. Heap의 특징이다. 0, 0.0, false, 언더바, null 등으로 초기화된다.
		System.out.println(avgs[0]); //default값은 0.0이다.
		
		//-----------------------------------------------
		String [] mans = new String[3];
		mans[0] = "가나";
		mans[1] = "다라";
		mans[2] = "마바";
		
		for (int i = 0; i < 3; i++) {
			System.out.println(mans[i]);
		}
		
		//------------------------------------------------
		//키보드로 입력받은 값을 배열에 집어넣기
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("숫자를 입력하세요");
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
	}

}
